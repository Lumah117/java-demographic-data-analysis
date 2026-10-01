# Java Demographic Data Analysis

An early Java console application developed as part of my university Software Development coursework.

The project builds upon introductory Java programming concepts by collecting information about multiple people, storing the data in arrays, and performing basic statistical analysis.

## Project Overview

The application asks the user how many people will be included in the dataset and dynamically creates arrays to store information for each person.

For every entry, the program collects:

- Name
- Age
- Gender

The collected data is then used to perform basic demographic analysis, including gender counts and mean age.

The coursework also introduced the concepts of identifying the oldest person and calculating statistical measures such as standard deviation.

## Technologies

- Java
- Java Standard Library
- `Scanner`

## Concepts Demonstrated

This project introduced and reinforced several programming concepts:

- Arrays
- `for` loops
- `while` loops
- Dynamic array allocation
- User input
- Input validation
- Conditional statements
- Accumulators and counters
- String comparison
- Basic statistical calculations
- Processing multiple related data records

## Program Flow

```text
Start
  |
  v
Enter number of people
  |
  v
Create data arrays
  |
  v
+----------------------+
| For each person      |
|                      |
| Enter name           |
| Enter age            |
| Enter gender         |
| Validate gender      |
| Accumulate data      |
+----------------------+
  |
  v
Analyse collected data
  |
  v
Display results
```

## Data Storage

The original implementation uses three parallel arrays:

```java
String[] name;
double[] age;
String[] gender;
```

Each array is dynamically sized according to the number of people entered by the user.

This provided an early introduction to storing and processing collections of related data before progressing to more structured object-oriented approaches.

## Analysis

The application was intended to determine information including:

- Number of male entries
- Number of female entries
- Gender percentages
- Mean age
- Oldest person
- Standard deviation of age

## Original Source Code

The original university implementation is preserved in:

`original/DataAnalysis.java`

The code has intentionally been retained in its original form as an example of my early Java development rather than being rewritten to reflect my current programming practices.

## Retrospective

Reviewing the project with substantially more software-development experience highlights several limitations in the original implementation.

### Oldest-Person Logic

The comparison used when determining the oldest person is reversed. Since `oldestAge` begins at zero, the condition does not identify ages greater than the current oldest value.

A corrected implementation would compare whether the current person's age is greater than the stored oldest age.

### Gender Validation

Gender counters are updated before the input-validation loop. If invalid input is initially entered and subsequently corrected, the corrected value is not included in the appropriate counter.

Validation should instead occur before processing the value.

### Percentage Calculation

The gender percentage calculation operates on integer values, resulting in integer division before multiplication by 100.

A modern implementation would explicitly use floating-point arithmetic when calculating percentages.

### Standard Deviation

The output references standard deviation, but the original implementation does not contain the calculation required to determine it.

This represents an incomplete element of the original coursework implementation.

## How I Would Approach It Today

A modern implementation would use a dedicated `Person` class rather than parallel arrays:

```text
Person
├── name
├── age
└── gender
```

The application could then maintain a collection of `Person` objects and separate responsibilities into dedicated components:

```text
User Input
    |
    v
Person Objects
    |
    v
Data Collection
    |
    v
Analysis
    |
    +--> Mean Age
    +--> Standard Deviation
    +--> Gender Distribution
    +--> Oldest Person
    |
    v
Results
```

Additional improvements would include:

- Robust numeric input validation
- Case-insensitive gender input
- Dedicated analysis methods
- Correct floating-point percentage calculations
- Standard-deviation calculation
- Unit tests
- Clear separation between input, data storage, analysis and presentation
- Use of collections rather than fixed arrays where appropriate

## Portfolio Context

This project is retained as an example of my early progression in Java programming.

Compared with my earlier introductory work, it demonstrates a move from simple conditional calculations toward processing collections of data, iterative algorithms, validation and basic statistical analysis.
