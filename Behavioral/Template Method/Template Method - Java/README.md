# Template Method

Template method is a behavioral design pattern, allows you to create a skeleton of an algorithm in the superclass and the subclass can override the specific steps of the algorithm without change the structure.

The superclass contains :
- the template method that contains a skeleton of an algorithm.
- abstract method (steps) of an algorithm that must be implemented by subclass.


### Example:

Imagine that you’re creating a data mining application that analyzes corporate documents. Users feed the app documents in various formats (PDF, DOC, CSV), and it tries to extract meaningful data from these docs in a uniform format.

The first version of the app could work only with DOC files. In the following version, it was able to support CSV files. A month later, you “taught” it to extract data from PDF files.

### Applicability

Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.

Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.