package ucv.android.Fragment;

public class Personajes {
  private int id;
  private String name;
  private String phone;
  private String email;
  private String groups;
  private int imageID;
  
public Personajes(int id, String name, String phone, String email,
		String groups, int imageID) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.groups = groups;
	this.imageID = imageID;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGroups() {
	return groups;
}

public void setGroups(String groups) {
	this.groups = groups;
}

public int getImageID() {
	return imageID;
}

public void setImageID(int imageID) {
	this.imageID = imageID;
}


  
  
}
