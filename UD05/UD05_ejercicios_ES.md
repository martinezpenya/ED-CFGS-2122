---
title: "UD05: ArgoUML"
language: EN
author: David Martínez Peña [www.martinezpenya.es]
subject: Development Environments
keywords: [EED, 2022, Environments, Development]
IES:IES Mestre Ramón Esteve (Catadau) [iesmre.es]
header: ${title} - ${subject} (ver: ${today})
footer: ${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
typora-root-url: ${filename}/../
typora-copy-images-to: ${filename}/../assets
---
# Introduction.

In order to better understand the class diagrams and their notation, the following is a complete example. In addition, the ArgoUML modeling environment has been used to create these UML diagrams. This environment specializes in modeling with UML and other graphical languages. It also allows you to both generate code from diagrams and generate diagrams from source code.

The ArgoUML application can be used from Windows, Linux, and MacOS X operating systems. The exercise format will be used to provide step-by-step instructions on how to create a class diagram based on the requirements of a statement.

>**Example of invoice management**
>
> Invoices from a company's suppliers can be from service providers or from suppliers of products or materials. Each of the invoices, of either type, has in common:
>
>- The invoice number.
>- The date of the invoice.
>- The total amount - which is calculated differently in some than in others.
>- Customer data, which is the NIF and name, and must be found in a separate class.
>- The detail of the invoice (whether it is materials or services).
>
>For both service invoices and product or material invoices, the last invoice issued must be kept in order to keep the invoice number in mind. There is a list of services with the description and price per hour of each.
>
>The details of the invoices must include:
>
>- In the invoices for services, each invoice contains a list of services with the date of service, the number of hours spent, and the price / hour per service. There may be more than one benefit from the same service on an invoice.
>- Product invoices must include a description, unit price, and quantity for each product (each invoice must have at least one).
>

# ArgoUML

The latest available version (0.35.1) can be found among the releases in the tigris github profile (https://github.com/argouml-tigris-org/argouml/releases).

We can download the zip file (https://github.com/argouml-tigris-org/argouml/releases/download/VERSION_0_35_1/ArgoUML-0.35.1.zip) and unzip it on our PC.

All releases are cross-platform, depending on whether we are on Linux, Windows, etc. we will launch the correct executable (sh, bat, etc...)

![](assets/ArgoUML_about.png)

Once opened we will see something similar to this:

![](assets/ArgoUML_environment.png)

# Our example step by step

## Start

To start working with argoUML, it is only necessary to start the application, since it is entirely dedicated to the design of UML diagrams. By default it creates an empty untitledModel (that we can rename) with two empty diagrams (class and use case). By right-clicking on the model, we can choose to create more diagrams, like sequence diagrams...etc.

![](assets/ArgoUML_createDiagram.png)

By now we only need to rename our model to InvoicesManagement:

![](assets/ArgoUML_renameModel.png)

## Creating the class diagram

The start screen is actually very intuitive, containing a bar of entities that are identified by their own UML symbols.

![](assets/ArgoUML_entityBar.png)

To start drawing classes, click on the class box (the second in the palette), and mark some point in the drawing area. The class will appear, without any associated information.

![](/assets/ArgoUML_createClass.png)

In the lower right part of the window, the properties of the class appear, which can be modified to our liking at any time, just by selecting it. In the window to the left of the properties, the critics appear, which are recommendations that we should follow to obtain a good UML diagram.

![](/assets/ArgoUML_classProperties.png)

Property box for a class

In the "attributes" and "operations" sections, we place everything (attributes and methods) related to the class. It is necessary to specify the name of the attribute or method, its visibility, its type, and its parameters (in the case of the method), separately. In this main tab, we mark the characteristics of the class itself, such as being abstract (as shown in the following figure).

The figure class, abstract

When a class is selected, an arrow with a hollow triangular tip appears at the top of it, so that it can be automatically stretched into an inheritance relationship:

Already the three classes of figures placed

Placing all the attributes and methods, we get the following final diagram:

final design

It is convenient to mark, in the model properties, that the visibility be seen:

Final diagram with visibilities
Generating the code

Once the diagram has been created, to generate the source code it is only necessary to press F7, or go to the main menu, option Generate (or Generate). It is capable of generating, from diagrams, code for C++, PHP, C# or Java.

Generate the classes



# Fuentes de información

- https://netbeans.apache.org/kb/docs/java/junit-intro.html
- https://www.discoduroderoer.es/como-hacer-una-aplicacion-de-prueba-con-junit/
