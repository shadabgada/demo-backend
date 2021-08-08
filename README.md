# demo-backend

This is one of the two services deployed on kubernetes

Build a docker Image
> docker build -t shadabgada/demo:1.0 .

Push to docker hub
> docker push shadabgada/demo:1.0

The environment variable name 'Stakater' is specified in docker file

<br>

For kubernetes setup guide please refer this [readme](https://github.com/shadabgada/demo-frontend) of frontend application


### Bonus:

Created a helm chart. Its available on branch helm-chart

commands:

- create helm chart
  > helm create backend
- view formatted output helm yaml contents
  > helm template test .\backend\
- deploy
  > helm install backend backend/

### Templatized parameters:
- port
- docker image
- service name
- service type
- replica count
- target port

