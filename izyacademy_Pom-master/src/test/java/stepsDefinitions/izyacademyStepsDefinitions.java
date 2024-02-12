package stepsDefinitions;


import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.loginIzyStep;
import steps.goPostStep;
import steps.newcategoryStep;
import steps.createCategoryStep;


public class izyacademyStepsDefinitions {

    loginIzyStep loginIzyStep = new loginIzyStep();
    goPostStep goPostStep = new goPostStep();
    newcategoryStep newcategoryStep = new newcategoryStep();
    createCategoryStep createCategoryStep = new createCategoryStep();

    @ParameterType(".*")
    public String usuario(String usuario){
        return  usuario;
    }

    @ParameterType("fila")
    public int fila(String captureGroup) {
        return Integer.parseInt(captureGroup);
    }



    @When("user enter the email as email with the {int}")
    public void UserEnterTheEmailAsEmailWithThe(int fila) {

        loginIzyStep.EnterEmail(fila);
    }

    @When("user enter the password as password with the {int}")
    public void UserEnterThePasswordAsPasswordWithThe(int fila) {
        loginIzyStep.EnterPassword(fila);
        loginIzyStep.ClickLogin();
         try {
           Thread.sleep(4000);
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
    }
    @When("User go to post page")
    public void userGoToPostPage() {
        goPostStep.ClickMenu();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        goPostStep.ClickPosts();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("user create the new category")
    public void userCreateTheNewCategory() {
        newcategoryStep.ClickCollapse();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        newcategoryStep.Clickcategory();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        createCategoryStep.EnterCategoryName();
        createCategoryStep.EnterDescription();
        createCategoryStep.ClickBotoncrearcategoria();

    }
    //@Then("the {user} looks at the home page")
  //  public void theUserLooksAtTheHomePage(String user) {
       // try {
         //   Thread.sleep(4000);
        //} catch (InterruptedException e) {
         //   throw new RuntimeException(e);
        //}
        //loginStep.CompareName(user);

    //}



}
