# Birth Registration Application

Welcome to the Birth Registration Application, a clone of the btr-services developed by eGov Foundation. This application is designed to facilitate the issuance of birth certificates, integrating various services to streamline the birth registration process.

## Service Dependencies

- **egov-persister**: Handles persistence of application data.
- **egov-mdms**: Manages Master Data Management Services.
- **egov-idgen**: Generates unique identifiers for applications.
- **egov-user**: Integrates with User service.
- **egov-workflow**: Manages workflow processes for birth registration.
- **btr-calculator**: Calculates the amount to be paid for birth registration.
- **billing-services**: Manages billing-related operations.

## Swagger API Contract

Explore the API contract using Swagger: [API Contract](link_to_swagger_contract)

## Service Details

This service is tightly integrated with the User service, IdGen service, and Workflow service. It allows for the creation, updating, and searching of birth registration applications. Additionally, it collaborates with the btr-calculator to calculate the required payment amount.

## API Details

BasePath: `/birth-registration/birth-services/v1/registration/[API endpoint]`

### Methods

a) **_create**: Creates a birth registration application and returns the application number.

b) **_update**: Updates a birth registration application based on the application number.

c) **_search**: Searches for birth registration applications based on the application number.

### Calculator Service API

A separate API spec is written for the calculator service, which includes the following APIs:

- **_calculate**: Returns the calculation for a given service application.
- **getbill or createbill**: Creates and returns the bill associated with a particular application.
- **_search**: Searches for calculations.

## Kafka Consumers

Consumes messages from the following topics:

- `kafka.topics.receipt.create`
- `btr.kafka.create.topic`

## Kafka Producers

Produces messages to the following topics:

- `save-bt-application`
- `update-bt-application`

Feel free to explore and contribute to the Birth Registration Application! If you have any questions or concerns, please refer to the Swagger API Contract or reach out to the project maintainers.
