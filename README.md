# CodeClan Hotel Towers

## Classes:

- `Bedroom`
- `ConferenceRoom`
- `Guest`
- `Hotel`
- `Room`
- `RoomType`

## Tests:

- `GuestTest.java`
- `BedroomTest.java`
- `ConferenceRoomTest.java`
- `HotelTest.java`

## MVP:

You are being asked to build a booking system for the new CodeClan Towers hotel.

Use TDD in JUnit to model the Hotel with Java classes, with separate test files for each class.

## Tasks:

- Create a `Guest` class, they should have a name, feel free to add more attributes later if you want.

- Create a `RoomType` enum of bedroom types (e.g. Single/Double) that has a capacity attribute.

- Create a `Room` abstract class with a capacity and collection of `Guests`.

- Create 2 different types of rooms that inherit from `Room`:

  1. `Bedroom` will additionally have a room number and `RoomType` (hint you can use the value of the `capacity` 
     attribute attached to the RoomType Enum and pass it to the `super()` function).

  2. `ConferenceRoom` will additionally have a name and any other properties you wish.

- Create a `Hotel` class, which has a collection of `Bedrooms` and a collection of `ConferenceRooms`.

- The `Hotel` will be able to check guests in/out of rooms.
