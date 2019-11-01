CREATE DATABASE events;
\c events;

CREATE TABLE events_table(
    id SERIAL PRIMARY KEY,
    eventName VARCHAR,
    eventDescription VARCHAR,
    eventDate DATE,
    startTime TIME,
    endTime TIME,
    eventLocation VARCHAR,
    eventPoster BYTEA

);
 CREATE TABLE bookings(
    id SERIAL PRIMARY KEY,
    payment int,
    events_id int
);

CREATE TABLE customer(
    id SERIAL PRIMARY KEY,
    customer_name VARCHAR
);

CREATE TABLE customer_booking(
    id SERIAL PRIMARY KEY,
    customer_id int,
    booking_id int
);
