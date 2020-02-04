## Part 1: Test it with SQL

SELECT column_name, data_type, table_schema FROM information_schema.columns
WHERE table_schema IN("techjobs");

## Part 2: Test it with SQL

SELECT employer.name FROM techjobs.employer WHERE employer.location IN("St.Louis City")

## Part 3: Test it with SQL

DROP TABLE techjobs.job

## Part 4: Test it with SQL