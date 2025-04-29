CREATE TABLE IF NOT EXISTS room (
    id SERIAL PRIMARY KEY,
    number VARCHAR(10) NOT NULL,
    price_per_night NUMERIC(10, 2) NOT NULL,
    type VARCHAR(50) NOT NULL
);

INSERT INTO room (number, price_per_night, type) VALUES 
  ('101', 150.00, 'Standard'),
  ('102', 200.00, 'Deluxe'),
  ('103', 250.00, 'Suite'),
  ('104', 300.00, 'Master Suite');