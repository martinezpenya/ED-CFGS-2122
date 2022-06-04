---
title: How to use the built-in VSCode on GitHub
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
[toc]
# `VsCode` integrated on `GitHub`

## Locate the repository.

First we locate the repository we want to collaborate with:

1. We look for the user (In all `GitHub`):

<img src="assets/vscode_01_localizar_repositorio.png" alt="Localizar repositorio" style="zoom:50%;" />

2. We choose `Repositories` tab:

<img src="assets/vscode_02_localizar_repositorio.png" alt="Localizar repositorio 2" style="zoom:50%;" />

3. We choose the one we are interested in modifying, in our case `ED-CFGS-2122`:

<img src="assets/vscode_03_repositorio_elegido.png" alt="Repositorio elegido" style="zoom:50%;" />



## Open integrated `VSCode`.

`Github` has a very powerful online editor based on `VSCode`.

Once we visualize the code of the repository we've selected:

<img src="assets/vscode_04_codigo.png" alt="Screenshot_20220106_171327" alt="Código" style="zoom:50%;" />

To open the editor we just have to press the "`.`" (period) of our keyboard:

<img src="assets/vscode_05_vscode1.png" alt="editor VSCode" style="zoom:50%;" />

We will visualize the structure of folders and files in a `VSCode` editor integrated in the Web browser.

## Update a file.

Once the mistake is detected within the [markdown](https://markdown.es/) code which is very easy to interpret (as long as you spend a few minutes on it) we can update the file, and an **M** will appear next to it because the file has been modified.

<img src="assets/vscode_06_vscode2.png" alt="Screenshot_20220106_172048" style="zoom:50%;" />

## Built-in `Git`

`VSCode` has a built-in GIT manager, the third icon in the sidebar: ![Screenshot_20220106_172635](assets/vscode_07_git.png)

1. We check the changed files:
<img src="assets/vscode_07_git1.png" alt="Verificar cambios" style="zoom: 80%;" />

2. We pass them to the "staged" area with the symbol "+":
<img src="assets/vscode_07_git2.png" alt="pasar a staged" style="zoom:80%;" />

4. We add the commit comment:
<img src="assets/vscode_07_git3.png" alt="comentario commit" style="zoom:80%;" />

4. We make the commit:
    <img src="assets/vscode_07_git4.png" alt="Screenshot_20220106_173720" style="zoom:80%;" />

As the repository is not ours it will show this message:

![Screenshot_20220106_173836](assets/vscode_07_git5.png)

Actually we can do the fork sooner or later, here's a little [vídeo](https://www.youtube.com/watch?v=zyT0sl3-kxE) which explains what a fork is.

Next, it asks us for the name of the branch that will be created and that we can then request to include in the original project:

<img src="assets/vscode_07_git6.png" alt="branch" style="zoom:80%;" />

Now it asks us if since we have created a fork, we want to change the repository, and work on our fork instead of on the original project, we click on [Switch to Fork]:

<img src="assets/vscode_07_git7.png" alt="cambiar al fork" style="zoom:80%;" />

Now we can exit the `VSCode` editor by clicking on the button with the three horizontal lines and choosing the "Go to Repository" option:
<img src="assets/vscode_07_git8.png" alt="Volver al repositorio" style="zoom:80%;" />

## Pull request

Once we return to our repository (our fork), it will detect that there are changes from the original repository and proposes that we make a pull request (a request to the user who owns the original repository to include our modification).

<img src="assets/vscode_08_pullrequest.png" alt="Screenshot_20220106_175237" style="zoom:80%;" />

Once the [Compare & pull request] button is pressed, the following screen appears:

![Screenshot_20220106_175639](assets/vscode_09_pullrequest2.png)

We must make sure that the modification can be added to the original repository "Able to merge", and that we indicate in the comments our full name so that the teacher can identify us. Notice that the name of the pull request is the name of the commit that we made from `VSCode`.

Now we must press the [Create pull request] button.

# Tasks

##  GitHub 1

Follow the steps in this guided practice to suggest a modification to any of the files in the teacher's repositories [martinezpenya](https://github.com/martinezpenya). Attach a pdf with a screenshot similar to this where you can see that you have requested the pull request and that you are waiting for it to be integrated into the original repository to the AULES task. Explain the meaning to each of the 5 sections underlined in the screenshot:
![Screenshot_20220106_180847](assets/vscode_10_pullrequest3.png)

## GitHub 2

Following the steps of the previous practice, we will create a repository, a partner will propose a pull-request that we must integrate in our original repository and vice versa, we will have to make a pull-request to our partner and he has to accept it.

You must attach a pdf to the AULES task with the steps to follow once the pull-request is received to accept it and integrate it into our repository, and also show where the name of the user who has collaborated with us in the repository appears.
