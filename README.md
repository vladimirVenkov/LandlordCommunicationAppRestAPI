# LandlordCommunicationAppRestAPI
RestAPI to serve The Landlord Communication Android Application

## RESTAPI 
https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI

## Android Application
https://github.com/vladimirVenkov/TheBeginning

## SQL Scripts to create database for the project and to add some test data:
https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/tree/master/DataBaseScripts

### Screenshots:
<img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-224926.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-224939.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-225010.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-225012.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-225017.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-225039.png" alt="drawing" width="200"/> <img src="https://github.com/vladimirVenkov/LandlordCommunicationAppRestAPI/blob/master/SCREENSHOTS/Screenshot_20181113-225055.png" alt="drawing" width="200"/>


## RESTAPI endpoints:

### GET /Accommodations
returns List of all accommodations

### GET /Accommodations/{accommodationId}
returns the accomodation with this id

### POST /Accommodations
creates accommodation - requests JSON body

### PUT /Accommodations/{id}
overwrites the accommodation with this id with the one in the required JSON body

### PUT /Accommodations/pay/{id}
pays the rent for this accommodation

### GET /Accommodations/{id}/Messages
returns list of all but deleted messages for this accommodation

### PUT /Accommodations/{id}/newTenant
sets the tenant from the requested body as a tenant to this accommodation

### PUT /Accommodations/freeThisAccommodation
free the accommodation from the requested body

### POST /Messages
saves message

### DELETE /Messages
deletes the message from the requested JSON body

### DELETE /Messages/old
deletes all messages older than 90 days

### PUT /Ratings/{ratedUserId}/{giverUserId}/{ratingValue}
creates or edits the rating with this rating value
a user can rate another user only once

### GET /Users
returns list of all users

### GET /Users/{id}
returns user with this id

### POST /Users
saves the user from the requested body

### GET /Users/tenants
returns list of all users who are tenants

### GET /Users/landlords
returns list of all users who are landlords

### GET /Users/{userId}/Accommodations
returns list of all accommodations owned or rented by this user

### GET /Users/{userId}/rating
returns the calculated rating for this user

### GET /Users/phone/{phonenumber}
returns the user according to his phonenumber
