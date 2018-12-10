package tma.ntt.demo.service;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tma.ntt.demo.entity.Contact;
import tma.ntt.demo.entity.Event;
import tma.ntt.demo.entity.Message;
import tma.ntt.demo.entity.OutlookUser;
import tma.ntt.demo.entity.PagedResult;

public interface OutlookService {

    @GET("/v1.0/me")
    Call<OutlookUser> getCurrentUser();

    @GET("/v1.0/me/mailfolders/{folderid}/messages")
    Call<PagedResult<Message>> getMessages(@Path("folderid") String folderId, @Query("$orderby") String orderBy, @Query("$select") String select,
            @Query("$top") Integer maxResults);

    @GET("/v1.0/me/events")
    Call<PagedResult<Event>> getEvents(@Query("$orderby") String orderBy, @Query("$select") String select, @Query("$top") Integer maxResults);

    @GET("/v1.0/me/contacts")
    Call<PagedResult<Contact>> getContacts(@Query("$orderby") String orderBy, @Query("$select") String select, @Query("$top") Integer maxResults);
}
