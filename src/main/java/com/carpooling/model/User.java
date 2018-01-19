package com.carpooling.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private String sexe;
	private boolean smoker;
	private String phone;
	private String email;
	private String username;
    private String password;
    private String passwordConfirm;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Route> routes;
	
	@ManyToOne
	private Role role;
	
	@ManyToOne
	private Adress adress;
	
	@OneToMany(mappedBy = "evaluatingUser", cascade = CascadeType.ALL)
	private Set<Feedback> evaluatingUsers;
	
	@OneToMany(mappedBy = "evaluatedUser", cascade = CascadeType.ALL)
	private Set<Feedback> evaluatedUsers;
	
	@OneToMany(mappedBy = "senderUser", cascade = CascadeType.ALL)
	private Set<Message> senderUsers;
	
	@OneToMany(mappedBy = "recieverUser", cascade = CascadeType.ALL)
	private Set<Message> recieverUsers;
	
	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	private Set<Car> cars;
	
	
	public User() {
		super();
	}
	public User(String firstName, String lastName, int age, String sexe, boolean smoker, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sexe = sexe;
		this.smoker = smoker;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	public User(String firstName, String lastName, int age, String sexe, boolean smoker, String phone, String email,
			Set<Route> routes,Role role, Adress adress, Set<Feedback> evaluatingUsers,
			Set<Feedback> evaluatedUsers) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sexe = sexe;
		this.smoker = smoker;
		this.phone = phone;
		this.email = email;
		this.routes = routes;
		this.role = role;
		this.adress = adress;
		this.evaluatingUsers = evaluatingUsers;
		this.evaluatedUsers = evaluatedUsers;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public boolean isSmoker() {
		return smoker;
	}
	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Set<Feedback> getEvaluatingUsers() {
		return evaluatingUsers;
	}
	public void setEvaluatingUsers(Set<Feedback> evaluatingUsers) {
		this.evaluatingUsers = evaluatingUsers;
	}
	public Set<Feedback> getEvaluatedUsers() {
		return evaluatedUsers;
	}
	public void setEvaluatedUsers(Set<Feedback> evaluatedUsers) {
		this.evaluatedUsers = evaluatedUsers;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Set<Message> getSenderUsers() {
		return senderUsers;
	}
	public void setSenderUsers(Set<Message> senderUsers) {
		this.senderUsers = senderUsers;
	}
	public Set<Message> getRecieverUsers() {
		return recieverUsers;
	}
	public void setRecieverUsers(Set<Message> recieverUsers) {
		this.recieverUsers = recieverUsers;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	

}