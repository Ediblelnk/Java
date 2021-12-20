Hello user,

I hope you enjoy this game of crazy eights I have constructed. Correctly downloading these files should not be a large issue, EXCEPT:

Because of the presence of special characters in these files, there is a specific way that you must format these files.

1. Download these files.

2. Add the files to the Eclipse Workspace

After this point you should notice the issue. The special characters used in these files were not encoded properly by the Eclipse Workspace. In order to fix this, you must

4. Copy and paste this line of code anywhere in the Card.java class: String special = '♥'; (The character there should be a heart. If not, use 'alt+3' to insert a heart there)

5. Save the program. You should get a prompt saying that the 'Save could not be completed'. It will ask you to 'Save as UTF-8'. CLICK this option.

6. Repeat this process for Hand.java, Deck.java, Player.java, Game.java, and CrazyEight.java

Now that each file is encoded properly,

7. Retake each file from the submission, and copy them into the Eclipse Workspace, WITHOUT deleting the newly encoded game files.

8. If will ask you if you want to override these files. Say 'Yes'.

9. This should result in the files now having the proper characters for the program to look and function correctly.

10. Enjoy the game!!