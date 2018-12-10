(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _components_movies_movies_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./components/movies/movies.component */ "./src/app/components/movies/movies.component.ts");
/* harmony import */ var _components_dashboard_dashboard_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/dashboard/dashboard.component */ "./src/app/components/dashboard/dashboard.component.ts");
/* harmony import */ var _components_movie_detail_movie_detail_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/movie-detail/movie-detail.component */ "./src/app/components/movie-detail/movie-detail.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

//import { CommonModule } from '@angular/common';




//import {LoginComponent} from "./components/login/login.component";
var routes = [
    { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
    { path: 'movies', component: _components_movies_movies_component__WEBPACK_IMPORTED_MODULE_2__["MoviesComponent"] },
    { path: 'dashboard', component: _components_dashboard_dashboard_component__WEBPACK_IMPORTED_MODULE_3__["DashboardComponent"] },
    { path: 'detail/:id', component: _components_movie_detail_movie_detail_component__WEBPACK_IMPORTED_MODULE_4__["MovieDetailComponent"] },
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [
                //  CommonModule
                _angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)
            ],
            // declarations: [] 
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "h1 {\r\n  color: red;\r\n}\r\n"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n<div style=\"text-align:center\">\n  <h1>\n    Welcome to {{ title }}!\n  </h1>\n  <nav>\n    <a routerLink=\"/movies\">Movies</a>\n    <br>\n    <a routerLink=\"/dashboard\">Dashboard</a>\n  </nav>\n\n  <router-outlet></router-outlet>\n\n   <!--  <app-movies></app-movies> -->\n \n   <app-messages></app-messages>\n</div>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'TMA ';
    }
    AppComponent.API_URL = "http://localhost:8080";
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_movies_movies_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/movies/movies.component */ "./src/app/components/movies/movies.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _components_movie_detail_movie_detail_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/movie-detail/movie-detail.component */ "./src/app/components/movie-detail/movie-detail.component.ts");
/* harmony import */ var _services_movie_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./services/movie.service */ "./src/app/services/movie.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _components_messages_messages_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./components/messages/messages.component */ "./src/app/components/messages/messages.component.ts");
/* harmony import */ var _services_message_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./services/message.service */ "./src/app/services/message.service.ts");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! .//app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _components_dashboard_dashboard_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/dashboard/dashboard.component */ "./src/app/components/dashboard/dashboard.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};












//import { LoginComponent } from './components/login/login.component';
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_2__["AppComponent"],
                _components_movies_movies_component__WEBPACK_IMPORTED_MODULE_3__["MoviesComponent"],
                _components_movie_detail_movie_detail_component__WEBPACK_IMPORTED_MODULE_5__["MovieDetailComponent"],
                _components_messages_messages_component__WEBPACK_IMPORTED_MODULE_8__["MessagesComponent"],
                _components_dashboard_dashboard_component__WEBPACK_IMPORTED_MODULE_11__["DashboardComponent"],
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_7__["HttpClientModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_10__["AppRoutingModule"]
            ],
            providers: [
                _services_movie_service__WEBPACK_IMPORTED_MODULE_6__["MovieService"],
                _services_message_service__WEBPACK_IMPORTED_MODULE_9__["MessageService"]
            ],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_2__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/components/dashboard/dashboard.component.css":
/*!**************************************************************!*\
  !*** ./src/app/components/dashboard/dashboard.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".col-1-4 {  \r\n    float: left;\r\n    padding-right: 20px;\r\n    padding-bottom: 20px;\r\n    width: 25%;\r\n}\r\n[class*'col-']  :last-of-type{\r\n    padding-right: 0;\r\n}\r\n.movie-box{\r\n    padding: 20px;\r\n    text-align: center;\r\n    color: #eee;\r\n    max-height: 120px;\r\n    min-width: 120px;\r\n    background: mediumseagreen;\r\n    border-radius: 20px;\r\n\r\n}\r\n.movie-box:hover {\r\n    background: blue;\r\n    cursor: pointer;\r\n\r\n}\r\n*,*::after, *:before{\r\n    box-sizing: border-box;\r\n}"

/***/ }),

/***/ "./src/app/components/dashboard/dashboard.component.html":
/*!***************************************************************!*\
  !*** ./src/app/components/dashboard/dashboard.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h3>Top 3 movies</h3>\n<div>\n  <a *ngFor = 'let movie of movies' class=\"col-1-4\"\n    routerLink = \"/detail/{{movie.id}}\"\n  >\n    <div class=\"movie-box\">\n        <h4>{{movie.name}}</h4>\n    </div>\n  </a>\n</div>\n"

/***/ }),

/***/ "./src/app/components/dashboard/dashboard.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/components/dashboard/dashboard.component.ts ***!
  \*************************************************************/
/*! exports provided: DashboardComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DashboardComponent", function() { return DashboardComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_movie_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/movie.service */ "./src/app/services/movie.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var DashboardComponent = /** @class */ (function () {
    function DashboardComponent(movieService) {
        this.movieService = movieService;
        this.movies = [];
    }
    DashboardComponent.prototype.ngOnInit = function () {
        this.getMovies();
    };
    DashboardComponent.prototype.getMovies = function () {
        var _this = this;
        this.movieService.getMovie().subscribe(function (movies) { return _this.movies = movies.slice(1, 3); });
    };
    DashboardComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-dashboard',
            template: __webpack_require__(/*! ./dashboard.component.html */ "./src/app/components/dashboard/dashboard.component.html"),
            styles: [__webpack_require__(/*! ./dashboard.component.css */ "./src/app/components/dashboard/dashboard.component.css")]
        }),
        __metadata("design:paramtypes", [_services_movie_service__WEBPACK_IMPORTED_MODULE_1__["MovieService"]])
    ], DashboardComponent);
    return DashboardComponent;
}());



/***/ }),

/***/ "./src/app/components/messages/messages.component.css":
/*!************************************************************!*\
  !*** ./src/app/components/messages/messages.component.css ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "button.clear{\r\n    background: #3399ff;\r\n    color: white;\r\n    border: none;\r\n    padding: 5px;\r\n    border-radius: 4px;\r\n}"

/***/ }),

/***/ "./src/app/components/messages/messages.component.html":
/*!*************************************************************!*\
  !*** ./src/app/components/messages/messages.component.html ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div *ngIf=\"messageService.messages.length\" style=\"text-align:left\">\n  <h4>Message :</h4>\n  <button class=\"clear\" (click)=\"messageService.deleteAll()\">Delete all messages</button>\n  <div *ngFor='let message of messageService.messages'>{{message}}</div>\n</div>"

/***/ }),

/***/ "./src/app/components/messages/messages.component.ts":
/*!***********************************************************!*\
  !*** ./src/app/components/messages/messages.component.ts ***!
  \***********************************************************/
/*! exports provided: MessagesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessagesComponent", function() { return MessagesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_message_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/message.service */ "./src/app/services/message.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MessagesComponent = /** @class */ (function () {
    function MessagesComponent(messageService) {
        this.messageService = messageService;
    }
    MessagesComponent.prototype.ngOnInit = function () {
    };
    MessagesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-messages',
            template: __webpack_require__(/*! ./messages.component.html */ "./src/app/components/messages/messages.component.html"),
            styles: [__webpack_require__(/*! ./messages.component.css */ "./src/app/components/messages/messages.component.css")]
        }),
        __metadata("design:paramtypes", [_services_message_service__WEBPACK_IMPORTED_MODULE_1__["MessageService"]])
    ], MessagesComponent);
    return MessagesComponent;
}());



/***/ }),

/***/ "./src/app/components/movie-detail/movie-detail.component.css":
/*!********************************************************************!*\
  !*** ./src/app/components/movie-detail/movie-detail.component.css ***!
  \********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".details{\r\n    background: mediumseagreen;\r\n    color: white;\r\n    padding: 0.5em;\r\n    margin: 1em;\r\n    max-width: 16em;\r\n    text-align: left;\r\n    font-size: 0.875em; /* 14px */\r\n}"

/***/ }),

/***/ "./src/app/components/movie-detail/movie-detail.component.html":
/*!*********************************************************************!*\
  !*** ./src/app/components/movie-detail/movie-detail.component.html ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div *ngIf=\"movie\" class=\"details\">\n    <h3>You selected : {{movie.name}}</h3>\n    <h3>Details:</h3>\n    <table style=\"width:100%\">\n        <tr>\n            <td>Name</td>\n            <td><input [(ngModel)] = \"movie.name\" placeholder=\"name\"></td>\n            \n        </tr>\n        <tr>\n                <td>Year</td>\n                <td><input [(ngModel)] = \"movie.year\" placeholder=\"year\"></td>\n                \n            </tr>\n\n    </table>\n    <button (click)=\"save()\">Save</button>\n    <button (click)=goBack()>Go back!</button>\n</div>"

/***/ }),

/***/ "./src/app/components/movie-detail/movie-detail.component.ts":
/*!*******************************************************************!*\
  !*** ./src/app/components/movie-detail/movie-detail.component.ts ***!
  \*******************************************************************/
/*! exports provided: MovieDetailComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MovieDetailComponent", function() { return MovieDetailComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _model_movie__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../model/movie */ "./src/app/model/movie.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
/* harmony import */ var _services_movie_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../services/movie.service */ "./src/app/services/movie.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var MovieDetailComponent = /** @class */ (function () {
    function MovieDetailComponent(route, movieService, location) {
        this.route = route;
        this.movieService = movieService;
        this.location = location;
    }
    MovieDetailComponent.prototype.ngOnInit = function () {
        this.getMovieFromRoute();
    };
    MovieDetailComponent.prototype.getMovieFromRoute = function () {
        var _this = this;
        var id = +this.route.snapshot.paramMap.get('id');
        console.log("this.route.snapshot.paramMap = " + JSON.stringify(this.route.snapshot.paramMap));
        this.movieService.getMovieFromId2(id).subscribe(function (movie) { return _this.movie = movie; });
    };
    MovieDetailComponent.prototype.save = function () {
        var _this = this;
        this.movieService.updateMovie(this.movie).subscribe(function () { return _this.goBack(); });
    };
    MovieDetailComponent.prototype.goBack = function () {
        this.location.back();
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", _model_movie__WEBPACK_IMPORTED_MODULE_1__["Movie"])
    ], MovieDetailComponent.prototype, "movie", void 0);
    MovieDetailComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-movie-detail',
            template: __webpack_require__(/*! ./movie-detail.component.html */ "./src/app/components/movie-detail/movie-detail.component.html"),
            styles: [__webpack_require__(/*! ./movie-detail.component.css */ "./src/app/components/movie-detail/movie-detail.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"],
            _services_movie_service__WEBPACK_IMPORTED_MODULE_4__["MovieService"],
            _angular_common__WEBPACK_IMPORTED_MODULE_3__["Location"]])
    ], MovieDetailComponent);
    return MovieDetailComponent;
}());



/***/ }),

/***/ "./src/app/components/movies/movies.component.css":
/*!********************************************************!*\
  !*** ./src/app/components/movies/movies.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".movies{\r\n    background: #3399ff;\r\n    padding: 0.5em 1em 0.5em 1.5em;\r\n    margin: 1em;\r\n    max-width: 16em;\r\n}\r\n\r\n.movies .movieli{\r\n    font-size: 0.875em;\r\n    font-family: Georgia, serif;\r\n    background: rgb(196, 200, 212);\r\n    padding: 0.3em;\r\n    margin: 0.2em;\r\n    text-align: left;\r\n}\r\n\r\n.selected {\r\n    background: mediumseagreen !important;\r\n    color: white;\r\n}\r\n\r\n.parent{\r\n    display: flex;\r\n}\r\n\r\n.details{\r\n    background: mediumseagreen;\r\n    color: white;\r\n    padding: 0.5em;\r\n    margin: 1em;\r\n    max-width: 16em;\r\n    text-align: left;\r\n    font-size: 0.875em; /* 14px */\r\n}"

/***/ }),

/***/ "./src/app/components/movies/movies.component.html":
/*!*********************************************************!*\
  !*** ./src/app/components/movies/movies.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<h1>Movie's details: </h1>\n<div><span>{{movie.id}}</span></div>\n<div><span>{{movie.name | uppercase}}</span></div>\n<div><span>{{movie.year}}</span></div>\n\n<h2>My movie list</h2>\n<div class=\"parent\">\n    <ol class=\"movies\">\n        <li class=\"movieli\" *ngFor=\"let eachMovie of movies\"\n        [class.selected] = \"eachMovie === selectedMovie\"\n        (click) = \"onSelect(eachMovie)\"\n        >\n        <a routerLink = \"/detail/{{eachMovie.id}}\"> {{eachMovie.name}} - {{eachMovie.year}}</a>\n           \n        </li>\n    </ol>\n\n    <div *ngIf=\"selectedMovie\" class=\"details\">\n        <h3>You selected : {{selectedMovie.name}}</h3>\n        <h3>Details:</h3>\n        <table style=\"width:100%\">\n            <tr>\n                <td>Name</td>\n                <td><input [(ngModel)] = \"selectedMovie.name\" placeholder=\"name\"></td>\n                \n            </tr>\n            <tr>\n                    <td>Year</td>\n                    <td><input [(ngModel)] = \"selectedMovie.year\" placeholder=\"year\"></td>\n                    \n                </tr>\n\n        </table>\n    </div>\n    <app-movie-detail [movie] = \"selectedMovie\"></app-movie-detail>\n    \n</div>\n\n"

/***/ }),

/***/ "./src/app/components/movies/movies.component.ts":
/*!*******************************************************!*\
  !*** ./src/app/components/movies/movies.component.ts ***!
  \*******************************************************/
/*! exports provided: MoviesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MoviesComponent", function() { return MoviesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _services_movie_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../services/movie.service */ "./src/app/services/movie.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MoviesComponent = /** @class */ (function () {
    function MoviesComponent(movieService) {
        this.movieService = movieService;
        this.movie = {
            id: 1,
            name: "Star wars",
            year: 1997
        };
    }
    MoviesComponent.prototype.getMovieFromService = function () {
        var _this = this;
        // this.movies = this.movieService.getMovie();
        this.movieService.getMovie2().subscribe(function (updatedMovie) {
            _this.movies = updatedMovie;
            console.log("this.movies  = " + JSON.stringify(_this.movies));
        });
    };
    MoviesComponent.prototype.ngOnInit = function () {
        this.getMovieFromService();
    };
    MoviesComponent.prototype.onSelect = function (movie) {
        this.selectedMovie = movie;
        console.log("seletedMovie = " + JSON.stringify(this.selectedMovie));
        /*  alert(`seletedMovie = ${JSON.stringify(this.selectedMovie)}`); */
    };
    MoviesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-movies',
            template: __webpack_require__(/*! ./movies.component.html */ "./src/app/components/movies/movies.component.html"),
            styles: [__webpack_require__(/*! ./movies.component.css */ "./src/app/components/movies/movies.component.css")]
        }),
        __metadata("design:paramtypes", [_services_movie_service__WEBPACK_IMPORTED_MODULE_1__["MovieService"]])
    ], MoviesComponent);
    return MoviesComponent;
}());



/***/ }),

/***/ "./src/app/model/movie.ts":
/*!********************************!*\
  !*** ./src/app/model/movie.ts ***!
  \********************************/
/*! exports provided: Movie */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Movie", function() { return Movie; });
var Movie = /** @class */ (function () {
    function Movie() {
    }
    return Movie;
}());



/***/ }),

/***/ "./src/app/model/movielist.ts":
/*!************************************!*\
  !*** ./src/app/model/movielist.ts ***!
  \************************************/
/*! exports provided: movieList */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "movieList", function() { return movieList; });
var movieList = [
    {
        id: 1,
        name: "Hary Porter1",
        year: 1990
    },
    {
        id: 2,
        name: "Hary Porter2",
        year: 1992
    },
    {
        id: 3,
        name: "Hary Porter3",
        year: 1993
    },
    {
        id: 4,
        name: "Hary Porter4",
        year: 1994
    }
];


/***/ }),

/***/ "./src/app/services/message.service.ts":
/*!*********************************************!*\
  !*** ./src/app/services/message.service.ts ***!
  \*********************************************/
/*! exports provided: MessageService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MessageService", function() { return MessageService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var MessageService = /** @class */ (function () {
    function MessageService() {
        this.messages = [];
    }
    MessageService.prototype.add = function (message) {
        this.messages.push(message);
    };
    MessageService.prototype.deleteAll = function () {
        this.messages = [];
    };
    MessageService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], MessageService);
    return MessageService;
}());



/***/ }),

/***/ "./src/app/services/movie.service.ts":
/*!*******************************************!*\
  !*** ./src/app/services/movie.service.ts ***!
  \*******************************************/
/*! exports provided: MovieService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MovieService", function() { return MovieService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _model_movielist__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../model/movielist */ "./src/app/model/movielist.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_internal_observable_of__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs/internal/observable/of */ "./node_modules/rxjs/internal/observable/of.js");
/* harmony import */ var rxjs_internal_observable_of__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(rxjs_internal_observable_of__WEBPACK_IMPORTED_MODULE_3__);
/* harmony import */ var _message_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./message.service */ "./src/app/services/message.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



// asyn with observable


var httpOption = {
    headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]({ 'Content-Type': 'application/json' })
};
var MovieService = /** @class */ (function () {
    function MovieService(messageService, http) {
        this.messageService = messageService;
        this.http = http;
        this.moviesUrl = 'http://localhost:8080/abc/api/movies';
    }
    MovieService.prototype.getMovie = function () {
        this.messageService.add(new Date().toLocaleTimeString() + ". Get movie list.");
        return Object(rxjs_internal_observable_of__WEBPACK_IMPORTED_MODULE_3__["of"])(_model_movielist__WEBPACK_IMPORTED_MODULE_1__["movieList"]);
    };
    MovieService.prototype.getMovieFromId = function (id) {
        return Object(rxjs_internal_observable_of__WEBPACK_IMPORTED_MODULE_3__["of"])(_model_movielist__WEBPACK_IMPORTED_MODULE_1__["movieList"].find(function (movie) { return movie.id === id; }));
    };
    MovieService.prototype.getMovie2 = function () {
        return this.http.get(this.moviesUrl);
    };
    MovieService.prototype.getMovieFromId2 = function (id) {
        var url = this.moviesUrl + "/" + id;
        return this.http.get(url);
    };
    MovieService.prototype.updateMovie = function (movie) {
        return this.http.put(this.moviesUrl + "/" + movie.id, movie, httpOption);
    };
    MovieService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_message_service__WEBPACK_IMPORTED_MODULE_4__["MessageService"],
            _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], MovieService);
    return MovieService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\mhanh\Documents\workspace-sts-3.8.1.RELEASE\BootDemo\new-app\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map