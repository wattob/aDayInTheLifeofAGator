# Report by Dillon Thoma and Ben Watto

## Design
For this project, we wanted to make a text based adventure game that took the user
through a series of decisions that they needed to make in order to make it through
a day as an Allegheny student. For the design, we focused on using conditional logic,
specifically if statements else statements, for each different decision. Eventually
through testing our program, we noticed that when we typed in the wrong input, the
program would crash. We decided to use more conditional logic in a similar form as
our original that would tell the user the command they typed was invalid, and to
type one of the commands listed above in the parenthesis, rather than crashing the
program and having to run it all over again.  Our program worked successfully and
the user could travel down different paths of the program, and it  would continue
to run if they typed something incorrectly. We designed the program to be able to
take the user down many different paths of a typical day as an Allegheny student
while not crashing the program if they went the wrong way or typed erroneous input.

## Implementation
When implementing code into our program, we had trouble correcting our brackets but
we were able to fix them using the feature in Atom that highlights the corresponding
curly brackets. It became quite tricky trying to keep track of all the different
brackets in our program, which is why indentation is crucial in longer programs with
more source code like this one. We also implemented an array list that stored our
greeting messages, which was quite an interesting feature. This allowed the source
code to be more organized, and not just strictly print line statements. Also, we
implemented a feature that showed the user all of the choices they made at the end
of the program if in fact they made it through the whole day. One final thing that
we implemented in our program was a while loop that allowed the program to ignore
the case of the inputs the user was typing, so that they did not have to capitalize
or lowercase each answer specific to how it was typed in the question. This makes
the program more convenient for the user, and was quite a simple thing to implement.

## Evaluation
To evaluate our system we went down each path many times. We typed incorrect input
for each decision as well as using the try again feature many times in order to ensure
the program did what we wanted it to. Also, we needed to make sure that our program's
output was displayed correctly in the terminal window, which it initially was not.
We had to evaluate this problem, along with others, and work tediously and carefully
together to fix the problems and ultimately have our program run correctly. Another
evaluation that we did of our program was making sure that each individual pathway
worked properly. As mentioned before, we went down each path and each individual
option multiple times, and each time we made a change to the program, to make sure
that the pathways did not randomly stop working during the changes. Ultimately, the
program takes the user through a day in the life of an Allegheny student, giving
them some everyday decisions we as students must face and trying to teach them to survive.
