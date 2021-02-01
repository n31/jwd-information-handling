# JWD Information Handling

Library that allows you to perform various operations with the text.

## Features

* **Sort paragraphs** by number of sentences
* **Sort sentences** by token length
* **Sort tokens** by ascending number of occurrences of a given character

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Installing

A step by step series of examples that tell you how to get a development env running

```
git clone https://github.com/n31/jwd-information-handling.git
cd jwd-information-handling
```

## Running the tests

```
mvn test
```

### Break down into end to end tests

This test reads text from file [text.txt](src/main/resources/text.txt) and performs various operations with it.

```
Text from file: 
    It has survived – not only (five) centuries, but also the leap into 13<<2 electronic typesetting, remaining 3>>5 essentially ~6&9|(3&4) unchanged. It was popularized in the 5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1) with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here’, making it look like readable English.
    It is a (2^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page when looking at its layout.
    Bye.

Original text with calculated expressions: 
    It has survived – not only (five) centuries, but also the leap into 52 electronic typesetting, remaining 0 essentially 9 unchanged. It was popularized in the 5 with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here’, making it look like readable English.
    It is a 1207 established fact that a reader will be of a page when looking at its layout.
    Bye.

Sorted by paragraphs text ascend: 
    It is a 1207 established fact that a reader will be of a page when looking at its layout.
    Bye.
    It has survived – not only (five) centuries, but also the leap into 52 electronic typesetting, remaining 0 essentially 9 unchanged. It was popularized in the 5 with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here’, making it look like readable English.

Sorted by sentences text ascend: 
    It is a 1207 established fact that a reader will be of a page when looking at its layout.
    Bye.
    It has survived – not only (five) centuries, but also the leap into 52 electronic typesetting, remaining 0 essentially 9 unchanged. It was popularized in the 5 with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
    It is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using 78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here’, making it look like readable English.

Sorted by lexemes text (by the count of entries of the letter 'o') ascend:
    Layout of looking 1207 It a a a at be established fact is its page reader that when will.
    Bye.
    Also electronic into not only (five) 0 52 9 It but centuries, essentially has leap remaining survived the typesetting, unchanged –. Lorem Lorem containing desktop more of of popularized software versions 5 Aldus Ipsum Ipsum It Letraset PageMaker and in including like passages, publishing recently release sheets the the was with with.
    Content layout long-established of looking It a a a at be by distracted fact is its page readable reader that the when will. (Content content distribution normal of of point to look more-or-less opposed 78 English Ipsum The a as has here), here’, is it it letters, like making readable that using using.
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Mikita Kavaliou** - *Initial work* - [n31](https://github.com/n31)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

