CREATE DATABASE hotel_db;
USE hotel_db;

CREATE TABLE reservations (
	reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_name VARCHAR(50),
    room_number VARCHAR(50),
    contact_number VARCHAR(15),
    reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);