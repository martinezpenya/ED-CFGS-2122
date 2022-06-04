---
    title: Annexed UD02: Useful tools of the IDE
    language: EN
    author: David Martínez Peña [www.martinezpenya.es]
    subject: Develoment Enviroment
    keywords: [EED, 2021, Develoment, Enviroment]
    IES: IES Mestre Ramón Esteve (Catadau) [iesmre.es]
    header: ${title} - ${subject} (ver: ${today}) 
    footer:${currentFileName}.pdf - ${author} - ${IES} - ${pageNo}/${pageCount}
    typora-root-url:${filename}/../
    typora-copy-images-to:${filename}/../assets
    imgcover:/media/DADES/NextCloud/DOCENCIA/ED_2122/ED-CFGS-2122/UD02/assets/cover.png
---
[toc]
# Useful tools of the IDE

## Netbeans

- Code templates.

  - `psvm + TAB` for `public static void main()`
  - `sout + TAB` for `System.out.println("")`
  - Consult more or customize: `Tools/Options/Editor/Code Templates`

- Fix imports (right click `Fix imports`)

- Fix package (when the file is not in the correct package, we can modify the code or folder structure)

- If a word is underlined in red, we can press ALT+ENTER to see the
  suggestions, for example:

  - Rename file based on class

- Refactor names of variables, methods, classes... (We change the name of a variable and modifies all occurrences in the source code. does it in a way smarter than "Replace All")

- CONTROL+SPACE view method parameters and/or complete names.

- ALT+SHIFT+F to format the code

- Insert Code:

  - ALT+INSERT o botón derecho `Insert Code...`
    - Constructor
    - Getters
    - Setters
    - Getters and setters
    - ...

- ```java
  Date fecha = new ~~Date~~ (2021, 2, 19); //Date constructor is deprecated
  ```

- When the name of a class appears in italics, it is because it is (`static`)

- Run with parameters: `Run/Set Project Configuration/Customize.../Run` you can define which is the main class in the `Main Class:` field with the format `<paquete>.<Clase>` and the parameters that the main method of said class will receive in the field `Arguments`: separating the parameters by spaces.

- Depuratión:

  - `Debug file` (debug file, CTRL+SHIFT+F5)
  - `Togle Line breakpoint` ((turn a breakpoint on/off, red square,
    CTRL+F8, eye on linux)
  - `Step over` (Next step, without going into details, F8)
  - `Step into` (Next step, going into details, F7)
  - `Continue` (Continue, F5)
  - `New Breakpoint...` (customize the conditions and place of the breakpoint CTRL+SHIFT+F8)
  - `New Watch...` (inspect the content of the variable or expression while debug the code)

- `WHEN`: When our programs get big we want to leave notes of what that we "let ourselves be done", that's what the EVERYTHING (from the English "to be done") is for, yes we add in a comment the words @todo, WHEN, FIXME (and some more that you can customize in `Tools/Options/Team/Action Items`) they will appear available in the window actions (`Window/Action items`). My recommendation on Netbeans is that modify the template so that it only recognizes when you type "WHERE:" (with two dots), and thus avoid confusion with usual words in Spanish such as "méWHERE".

## Eclipse

- Code templates.

  - `main + CONTROL+SPACE` and select `main method` for `public static void main()`
  - `sysou + CONTROL+SPACE` for `System.out.println("")`
  - Consult more or customize: `Window/Preferences/Java/Editor/Templates`

- Organize imports (right click `Source/Organize imports` o `CONTROL+SHIFT+O`)

- Fix package (when the file is not in the correct package, we can modify the code or folder structure).

- If a word is underlined in red, we can press F2 to see the suggestions, for example:

  - Rename file based on class

- Refactor names of variables, methods, classes... (We change the name of a variable and modifies all occurrences in the source code. does it in a way smarter than "Replace All").

- The completion of method parameters and/or completion of names appears automatically, once we have chosen the desired method we can toggle between the parameters with the `TAB` key.
  
- CONTROL+SHIFT+F to format the code

  - Generate code automatically:
    - Inside the Source `Source`
    - Generate Getters and Setters...
    - Generate toString()...
    - Generate Constructor using fields...
    - Generate Constructor from Superclass...

- When the name of a class appears crossed out, it is because it is better not to use it and there are to look for an alternative (`dreprecated`)

  ```java
  Date fecha = new ~~Date~~ (2021, 2, 19); //Date constructor is deprecated
  ```

- When the name of a class appears in italics (in the invocations) it is because it is static (`static`)

- Run with parameters: `Run/Run Configurations`on the left you must choose your class within the `Java Application`section and on the right side you can define which is the main class in the `Main` tab and the parameters that the `main` method will receive from said class in the a `Arguments` tab, separating the parameters by spaces.

- Depuration:

  - `Debug` (debug file, F11)
  - `Togle Line breakpoint`  (activate/deactivate a breakpoint, blue circle, CTRL+SHIFT+B).
  - `Step over`  (Next step, without going into details, F6).
  - `Step into` (Next step, going into details, F5).
  - `Continue` (Continue, F8)
  - I have not found a way to condition a breakpoint as it does
    netbeans.
  - `Run/Watch` menu (inspect the content of the variable or expression while code is debugged).

- `WHEN`: our programs get big we want to leave notes of what that we "let ourselves be done", that's what the EVERYTHING (from the English "to be done") is for, yes we add in a comment the words @EVERYTHING,EVERYTHING, FIXME (and some more that you can customize `Window/Preferences/General/Editors/Task tags`) will appear available in the actions window (`Window/Show view/Tasks`).  Eclipse only recognizes the `//WHEN` that goes along with the comment is to say "méWHERE". In addition, eclipse sets priorities and you can customize the presentation and priorities.

# Information sources

- [Wikipedia](https://es.wikipedia.org)
- [Code&Coke (Fernando Valdeón)](http://entornos.codeandcoke.com/doku.php?id=start)
- Notes IES El Grao (Mª Isabel Barquilla?)
- [Notes IOC (Marcel García)](https://ioc.xtec.cat/materials/FP/Recursos/fp_dam_m05_/web/fp_dam_m05_htmlindex/index.html)
- [Notes José Luis Comesaña](https://www.sitiolibre.com/)
- [Notes IES Luis Vélez de Guevara 17-18 (José Antonio Muñoz Jiménez)](http://jamj2000.github.io/slides/2017/09/05/entornosdesarrollo/)
