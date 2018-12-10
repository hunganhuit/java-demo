package dockerclient;

import java.io.File;
import java.util.List;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectVolumeResponse;
import com.github.dockerjava.api.command.ListVolumesResponse;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.Network;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.command.BuildImageResultCallback;

public class Client {
    private static final String dockerCertPath = "C:\\Users\\mhanh\\.docker\\machine\\machines\\default";
    private static final String dockerFile = "D:\\docker\\web1";
    private static final String dockerHost = "tcp://192.168.99.100:2376";

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Hello ladies and gentlemen..!");
        DefaultDockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder().withDockerHost(dockerHost).withDockerCertPath(dockerCertPath)
                .withDockerTlsVerify("1").build();

        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();
        System.out.println("----------- Executing docker ....");
//         System.out.println("- Building docker image ....");
//         String imageId = dockerClient.buildImageCmd()
//         .withDockerfile(new File(dockerFile))
//         .withPull(true)
//         .withNoCache(true)
//         .withTag("image1:v1")
//         .exec(new BuildImageResultCallback())
//         .awaitImageId();
//         System.out.println("- Image id : " + imageId);



        List<Image> images = dockerClient.listImagesCmd().exec();
        System.out.println("-------- List Images : ....");
        for (Image image : images) {
            System.out.println(image.getRepoTags()[0] + "     " + image.getId());


        }

        System.out.println("------------ Create container ....");
        // CreateContainerResponse container = dockerClient.createContainerCmd("images1:v1")
        // .withName("web3")
        // .withHostName("hunganh")
        // .withStdinOpen(true)
        // .withTty(true)
        // .withPortBindings(PortBinding.parse("9000:80"))
        // .withExposedPorts(new ExposedPort(80))
        // .exec();


        System.out.println("---------- Snapshot container ....");
//        String imageId = dockerClient.commitCmd("fc9eb824dae3").withAuthor("hunganhuit").withRepository("image2").withTag("v2").exec();


        System.out.println("--------- List Container : ....");
        List<Container> containers = dockerClient.listContainersCmd().withShowAll(true).exec();
        for (Container ct : containers) {
            System.out.println(ct.getNames()[0] + "     " + ct.getStatus());

        }
        

        System.out.println("------- List Network : ....");
        List<Network> networks = dockerClient.listNetworksCmd().exec();
        for (Network nw : networks) {
            System.out.println("-" + nw.getName() + "  " + nw.getDriver() + "   " + nw.getId());
        }
        
        System.out.println("------- List Volume : ....");
        List<InspectVolumeResponse> volumes = dockerClient.listVolumesCmd().exec().getVolumes();
        for (InspectVolumeResponse volume : volumes) {
            System.out.println("-" + volume.getName() + "  " + volume.getDriver() + "   " + volume.getMountpoint());
        }
        
    }

}
