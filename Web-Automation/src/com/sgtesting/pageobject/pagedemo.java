package com.sgtesting.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagedemo 
{
	public pagedemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Login Page, User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Login Page, Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login Page, Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Home Page, Flyout Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}                                                  

	//Home Page, Logout Link                            
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
//Create user
     @FindBy(linkText="USERS")
private WebElement oUSERS;
public WebElement getUSERS()
{
	return oUSERS;
}
@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
private WebElement oAddUser;
public WebElement getAddUser()
{
	return oAddUser;
}
private WebElement firstName;
public WebElement getfirstName()
{
	return firstName;
}

private WebElement lastName;
public WebElement getlastName()
{
	return lastName;
}
private WebElement email;
public WebElement getemail()
{
	return email;
}
private WebElement usernameColumn;
public WebElement getusernameColumn()
{
	return usernameColumn;
}
private WebElement password;
public WebElement getpassword()
{
	return password;
}
private WebElement passwordCopy;
public WebElement getpasswordCopy()
{
	return passwordCopy;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement CreateUser;
public WebElement getCreateUser()
{
	return CreateUser;
}


//modify user
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
private WebElement USERS;
public WebElement oUSERS()
{
	return USERS;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
private WebElement userNameSpan;
public WebElement getuserNameSpan()
{
	return userNameSpan;
}

@FindBy(xpath="//*[@id=\"userDataLightBox_lastNameField\"]")
private WebElement olastName;
public WebElement sendlastName()
{
	return olastName;
}

@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement SaveChanges;
public WebElement getSaveChanges()
{
	return SaveChanges;
}


//delete user
@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
private WebElement userNameSpan1;
public WebElement getloaddelete()
{
	return userNameSpan1;
}

private WebElement userDataLightBox_deleteBtn;
public WebElement getDeleteUser()
{
	return userDataLightBox_deleteBtn;
}
//creation of customer
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
private WebElement task;
public WebElement gettotask()
{
	return task;
}
//creation add new
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
private WebElement AddNew;
public WebElement getAddNew()
{
	return AddNew;
}
//create customer
@FindBy(xpath="/html/body/div[14]/div[1]")
private WebElement newcustomer;
public WebElement getcustomer()
{
	return newcustomer;
}
//customer name
private WebElement customerLightBox_nameField;
public WebElement getcustomername()
{
	return customerLightBox_nameField;
}
@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
private WebElement createcustomer;
public WebElement getaddcustomer()
{
	return createcustomer;
}

//modifycustomer
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement setting;
public WebElement getsetting()
{
	return setting;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
private WebElement modifycus;
public WebElement getmodifycus()
{
	return modifycus;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement changemodify;
public WebElement getmodify()
{
	return changemodify;
}
//delete
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement setting1;
public WebElement getsetting1()
{
	return setting1;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
private WebElement ACTIONS;
public WebElement getaction()
{
	return ACTIONS;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
private WebElement delete1;
public WebElement getdelete1()
{
	return delete1;
}
private WebElement customerPanel_deleteConfirm_submitTitle;
public WebElement perdelete()
{
	return customerPanel_deleteConfirm_submitTitle;
}


//create project
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
private WebElement project;
public WebElement getproject()
{
	return project;
}
@FindBy(xpath="/html/body/div[14]/div[2]")
private WebElement addproject;
public WebElement newproject()
{
	return addproject;
}
@FindBy(id="projectPopup_projectNameField")
private WebElement projectname;
public WebElement getprojectname()
{
	return projectname;
}
@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
private WebElement createproject;
public WebElement getcreateproject()
{
	return createproject;
}

//delete project
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement deleteproject;
public WebElement getdeleteproject()
{
	return deleteproject;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
private WebElement deleteaction;
public WebElement getdeleteaction()
{
	return deleteaction;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
private WebElement deletebutton;
public WebElement getdeletebutton()
{
	return deletebutton;
}
@FindBy(id="projectPanel_deleteConfirm_submitTitle")
private WebElement confirmdelete;
public WebElement getconfirmdelete()
{
	return confirmdelete;
}

//modify project
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement projectmodify;
public WebElement getprojectmodify()
{
	return projectmodify;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
private WebElement writeproject;
public WebElement getwriteproject()
{
	return writeproject;
}

@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement mproject;
public WebElement getmproject()
{
	return mproject;
}

//create Task
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
private WebElement createtask;
public WebElement gettast()
{
	return createtask;
}

@FindBy(xpath="/html/body/div[13]/div[1]")
private WebElement addtask;
public WebElement getaddtask()
{
	return addtask;
}

@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
private WebElement newtask;
public WebElement getnewtask()
{
	return newtask;
}

@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
private WebElement taskbutton;
public WebElement gettaskbutton()
{
	return taskbutton;
}

//delete task
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
private WebElement deltask;
public WebElement getdeltask()
{
	return deltask;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
private WebElement delaction;
public WebElement getdelaction()
{
	return delaction;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
private WebElement delbutton;
public WebElement getdelbutton()
{
	return delbutton;
}

@FindBy(id="taskPanel_deleteConfirm_submitTitle")
private WebElement delconfirm;
public WebElement getdelconfirm()
{
	return delconfirm;
}
}
