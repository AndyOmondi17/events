CREATE DATABASE events;
\c events;

CREATE TABLE events_table(
    id SERIAL PRIMARY KEY,
    event_name VARCHAR,
    event_description VARCHAR,
    event_date DATE,
    event_location VARCHAR,
    event_poster BYTEA,
    event_startTime TIME,
    event_endTime TIME,
    category_type VARCHAR
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