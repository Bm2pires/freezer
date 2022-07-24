# freezer

A Simple Spring Boot application to mimic a freezer

I decided to structure the code into folders, with folders for entities, repositories, request and response models, restcontroller and the services folders. This was to made the code cleaner to read. I also decided to implement different HTTP methods such as POST, GET and PUT to try to follow good programming practices when using CRUD operations. I also try to vary the ways in which the application was retrieving the data in that I used Request body, Path variable and Request parameters. I tried to make the URL endpoints as easily readable and understandable as possible aswell.

A big challenge when writing the application was to start from the ground up and following in a stepwise fashion rather than think of every possible scenario coding wise. To overcome this, I had to begin from the entity class and then build the rest controller, within the rest controller I wrote the functions from the middleware to the backend and test them to make sure they worked to then begin implementing the next function. Using this methodology I managed to create all the functionality required.

A possible enhancement to the program could be to try and reduce the number of request and response models being used to improve code efficiency. I could also add some validation logic to the services and make sure that the data being received is fool-proof.

