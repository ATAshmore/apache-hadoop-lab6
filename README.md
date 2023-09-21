# apache-hadoop-lab6

This repository contains a collection of Hadoop MapReduce lab exercises originally designed for a course aimed at undergraduates. These labs cover various aspects of Hadoop MapReduce programming, including writing custom MapReduce programs, implementing partitioners, using custom WritableComparable types, and working with SequenceFiles and file compression. Each lab exercise is described below:

## Lab 1: Writing a Partitioner
- **Objective**: Create a MapReduce job with multiple Reducers and implement a Partitioner to determine which Reducer each piece of Mapper output is sent to.
- **Key Concepts**: Partitioning, Multiple Reducers

## Lab 2: Implementing a Custom WritableComparable
- **Objective**: Create a custom WritableComparable type to hold two strings and use it in a MapReduce program to count occurrences of specific string pairs.
- **Key Concepts**: Custom WritableComparable, Key-Value Pairs

## Lab 3: Using SequenceFiles and File Compression
- **Objective**: Develop a MapReduce application to convert text data to a SequenceFile and then modify it to compress the SequenceFile using Snappy compression. Also, create another MapReduce program to uncompress the files.
- **Key Concepts**: SequenceFiles, Compression, Snappy codec

## Lab 4: Writing a MapReduce Streaming Program
- **Objective**: Write a MapReduce Streaming program using a scripting language (e.g., Python, Perl, Ruby) to calculate average word lengths for letters.
- **Key Concepts**: MapReduce Streaming, Scripting Languages

## Lab 5: Writing Unit Tests With the MRUnit Framework
- **Objective**: Write unit tests for a MapReduce program using the MRUnit framework to ensure that Mapper, Reducer, and the entire MapReduce flow work correctly.
- **Key Concepts**: Unit Testing, MRUnit Framework

Each lab includes detailed instructions, Java code stubs, and guidance on how to set up and run the MapReduce programs. Before attempting these labs, ensure that you have Hadoop and the necessary development environment configured.

Please note that these labs were originally designed for educational purposes and may require adaptations to work with newer Hadoop versions or different environments.

