CREATE TABLE IF NOT EXISTS ExpenseCategory (
    id LONG PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Expense (
    id LONG PRIMARY KEY AUTO_INCREMENT NOT NULL,
    amount DOUBLE NOT NULL,
    category_id LONG NOT NULL,
    category_name VARCHAR(30) NOT NULL,
    date VARCHAR(20),
    detail VARCHAR(30),

    FOREIGN KEY (category_id) REFERENCES ExpenseCategory(id)
);
