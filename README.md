
# Temperature App

Get temperature data by city name. This project developed with java 17 and spring boot.


## Run Locally

Clone the project

```bash
  git clone https://github.com/OguzKaanKaras/temperature-app.git
```

Go to the project directory

```bash
  cd temperature-app
```

Spring boot project including Tomcat, so this command will install requirements and start project:

```bash
  mvn spring-boot:run
```



## API Reference

#### Fetch data with GET method and 'q' query parameter

```http
  GET <domain>/temperature?q=istanbul
```


#### Fetch data with POST method and 'query' body parameter

```http
  POST <domain>/temperature

Request Body:
  {
    "query":"istanbul"
  }
```




## Notes

Project has no Sql or NoSql database configuration. 
Data reading from 'temperature-app/src/main/resources/data.json' file when project starting. You can add new data to data.json file and check it. # temperature-app-main
