# tabletop
## Server
### Starting
```
$ cd server
$ gradlew bootRun
```
Server will be available at `localhost:8080`.

Currently, an in-memory SQL H2 database is used. Its state is saved to file and automatically loaded on the next server startup. A console for the database is available at `localhost:8080/h2` with these credentials:
```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:file:./db
User Name: sa
Password: (blank)
```
### Stack
* Spring Boot
* Spring Security
* Spring Data JPA
* Spring Data REST
## App
```
$ cd app
```
### Setup
Execute this once:
```
$ npm install
```
And then every time you want to start the application:
```
$ npm start
```
App will be available at `localhost:3000`
### Stack
* [React](https://facebook.github.io/react/)
* [Redux](http://redux.js.org/docs/introduction/)
* [Material Design Lite](https://getmdl.io/)
* [React MDL](https://react-mdl.github.io/react-mdl/)

### Useful commands
Extracted from [React Redux starter kit](https://github.com/davezuko/react-redux-starter-kit):

|`npm run <script>`|Description|
|------------------|-----------|
|`start`|Serves your app at `localhost:3000`. HMR will be enabled in development.|
|`compile`|Compiles the application to disk (`~/dist` by default).|
|`lint`|Lint all `.js` files.|
|`lint:fix`|Lint and fix all `.js` files. [Read more on this](http://eslint.org/docs/user-guide/command-line-interface.html#fix).|

## Achievements
TODO
