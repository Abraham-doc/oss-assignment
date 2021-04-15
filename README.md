# OSS ASSIGNMENT 4 Project
## This is java project submitted for OSS Assginment 4

OSS Assignment 4 is a web project is developed using technologies Java, Angular 10, HTML.  

## Technologies
- [Angular10] - HTML enhanced for web apps!
- [Eclipse IDE] - Awesome web-based text editor
- [Spring Boot] - Ready to deploy technologies

## Features
- REST services uses microsevices architecture 
- Single sign on using IDP
- Openshift deployment using helm3

## Contributors
- Group Member 1:  Monish Daniel E                (2020MT93017)
- Group Member 2:  Narendra Nath Mahato       (2020MT93258)
- Group Member 3 : Monish Abraham               (2020MT93191

By default, the Docker will expose port 8080, so change this within the
Dockerfile if necessary. When ready, simply use the Dockerfile to
build the image.

```sh
cd oss-assignment
docker build -t <youruser>/oss-assignment:${package.json.version} .
```

Once done, run the Docker image and map the port to whatever you wish on
your host. In this example, we simply map port 8000 of the host to
port 8080 of the Docker (or whatever port was exposed in the Dockerfile):

```sh
docker run -d -p 8000:8080 --restart=always --cap-add=SYS_ADMIN --name=oss-assignement <youruser>/oss-assignement:${package.json.version}
```

> Note: `--capt-add=SYS-ADMIN` is required for PDF rendering.

Verify the deployment by navigating to your server address in
your preferred browser.

```sh
127.0.0.1:8000
```

## License

MIT

