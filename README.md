# Buyogo Backend Assignment 

## Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Installation](#installation)
4. [Configuration](#configuration)
5. [Running the Server](#running-the-server)
6. [Using the Moderation API](#using-the-moderation-api)
7. [Expected Results](#expected-results)
8. [Troubleshooting](#troubleshooting)

## Introduction
This repository contains the codebase for the Traini8 MVP registry for Govt-funded Training Centers. The project is aimed at creating APIs to create and retrieve training center information, with a focus on functionality, performance, validation, and good coding practices.

## Prerequisites
To run this server, you will need:
- Java Development Kit (JDK) 22
- MongoDB URI
- Postman or a similar tool for sending HTTP requests

## Installation
Follow these steps to install the required dependencies:
1. Clone the Repository:
    ```
2. Install Dependencies:
    ```bash
    npm install
    ```

## Configuration
Create a `application.properties` File: Create a `application.properties` file in the src/main/resources directory of your project and add the following content:
```plaintext
spring.data.mongodb.uri=your_mongodb_uri_here
```

## Running the Server

To start the server, run the TrainingCenterRegisteryApplication file.

## Using the API

### Sending a Request
Use Postman or any similar tool to send a POST request:
- URL: http://localhost:8080/
- Method: POST
- Body: JSON format
```json
{
  "input": "Info regarding training center"
}
```

## Expected Results
After sending the POST request with the text, you should receive a JSON response from the server that includes the training center info saved results.

This setup guide ensures you have everything you need to get the traini8 server up and running. Follow the steps carefully and validate each step to avoid common issues.
    ```bash
    git clone [repository-url]
    cd [project-folder]
