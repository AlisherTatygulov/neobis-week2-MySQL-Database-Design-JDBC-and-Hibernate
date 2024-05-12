CREATE DATABASE IF NOT EXISTS book_shop;


USE book_shop;

-- Create Books Table
CREATE TABLE Books (
    id INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    quantity_available INT NOT NULL
);

-- Create Sales Table
CREATE TABLE Sales (
    id INT NOT NULL,
    date DATE NOT NULL,
    book_id INT NOT NULL,
    quantity_sold INT NOT NULL,
    total_price DECIMAL(10, 2) NOT NULL,
    customer_id INT NOT NULL
);

-- Create Customers Table
CREATE TABLE Customers (
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    contact_information VARCHAR(255) NOT NULL
);

-- Add primary key to Books table
ALTER TABLE Books
ADD PRIMARY KEY (id);

-- Add primary key to Sales table
ALTER TABLE Sales
ADD PRIMARY KEY (id);

-- Add primary key to Customers table
ALTER TABLE Customers
ADD PRIMARY KEY (id);


-- Alter tables to add auto-increment to id column
ALTER TABLE Books
MODIFY COLUMN id INT AUTO_INCREMENT;

ALTER TABLE Sales
MODIFY COLUMN id INT AUTO_INCREMENT;

ALTER TABLE Customers
MODIFY COLUMN id INT AUTO_INCREMENT;

-- Add foreign key constraint to Sales table referencing Books table
ALTER TABLE Sales
ADD CONSTRAINT fk_sales_book_id
FOREIGN KEY (book_id)
REFERENCES Books(id)
ON DELETE CASCADE;

-- Add foreign key constraint to Sales table referencing Customers table
ALTER TABLE Sales
ADD CONSTRAINT fk_sales_customer_id
FOREIGN KEY (customer_id)
REFERENCES Customers(id)
ON DELETE CASCADE;