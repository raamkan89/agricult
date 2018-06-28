/**
 * 
 */
var user = {}
var userDetails = {};
var categories = {};
var productDetails = {};
$(document).ready(function() {
	getCategories();
	$('#login-submit').on('click', function() {
		$('#login-form').submit(function(e){
			loginSubmit();
			$('#login-form').modal('hide');
		});
	})
	$('#register').on('click', function() {
		$('#register-form').submit(function(e) {
			e.preventDefault();
			registerSubmit();
			$('#registrationForm').modal('hide');
			$("#confirmLoginForm").modal('show');
			getUserIdDetails();
		});
	})
	alert(user["firstName"]);
	alert(user["userId"]);
});

$(function() {
	$('#signingUp').click(function() {
		$('#registrationForm').modal('show');
		return false;
	})
	$('#login').click(function() {
		$('#loginForm').modal('show');
		return false;
	})
	$('a[id=openRequest]').click(function() {
		$('#requestForm').modal('show');
		return false;
	});
});

function registerSubmit() {
	user["firstName"] = $("#firstName").val();
	user["lastName"] = $("#lastName").val();
	user["dob"] = $("#dob").val();
	user["mobilenumber"] = $("#mobileNumber").val();
	user["address"] = $("#address").val();
	user["city"] = $("#city").val();
	user["state"] = $("#state").val();
	user["pincode"] = $("#pincode").val();
	user["occupationType"] = $('form input[type=radio]:checked').val();

	$.ajax({
		type : "post",
		contentType : "application/json",
		url : "/signup",
		data : JSON.stringify(user),
		dataType : 'json',
		cache : false,
		timeout : 60000,
		success : function(data) {
			console.log("Success");
		}
	})
}

function loginSubmit() {
	user["userId"] = $("#loginuserid").val();
	user["password"] = $("#loginpassword").val();
	$.ajax({
		type : "post",
		contentType : "application/json",
		url : "/login",
		data : JSON.stringify(user),
		dataType : 'json',
		cache : false,
		timeout : 60000,
		success : function(data) {
			console.log("Login Success");
		}
	})
}



function confirmRegister(user){
	$('#userId').html(user.userId);
	$('#signupconfirm-submit').click(function() {
		$('#signupconfirm-form').submit(function(e) {
			user["userId"] = user.userId;
			user["password"] = $("#password").val();
			user["confirmPassword"] = $("#confirmpassword").val();
			$.ajax({
				type : "post",
				contentType : "application/json",
				url : "/confirm-register",
				data : JSON.stringify(user),
				dataType : 'json',
				cache : false,
				timeout : 60000,
				success : function(data) {
					console.log("Success");
					}
				});
			});
		});
}

function getUserIdDetails() {
	var firstName = $("#firstName").val();
	var dob = $("#dob").val();
	$.ajax({
		type : "get",
		contentType : "application/json",
		url : "/getUserId/" + firstName + "/" + dob,
		dataType : 'json',
		cache : false,
		timeout : 60000,
		success : function(response) {
			userDetails = JSON.stringify(response);
			confirmRegister(response);
		},
		error : function(response) {
			return response;
		}
	});
}


function getFruitProducts() {
	$.ajax({
		type: "get",
		contentType : "application/json",
		url : "/getFruitProducts",
		datatype: 'json'
	}).done(function(response){
		productDetails = response;
		getFruitProductDetails(productDetails);
		console.log(productDetails);
	});
}


function getVeggieProducts() {
	$.ajax({
		type: "get",
		contentType : "application/json",
		url : "/getVegetableProducts",
		datatype: 'json'
	}).done(function(response){
		productDetails = response;
		getVeggieProductDetails(productDetails);
		console.log(productDetails);
	});
}



function getCropProducts() {
	$.ajax({
		type: "get",
		contentType : "application/json",
		url : "/getCropProducts",
		datatype: 'json'
	}).done(function(response){
		productDetails = response;
		getCropProductDetails(productDetails);
		console.log(productDetails);
	});
}


function getDairyAndPoultry() {
	$.ajax({
		type: "get",
		contentType : "application/json",
		url : "/getDairyAndPoultryProducts",
		datatype: 'json'
	}).done(function(response){
		productDetails = response;
		getDairyPoultryProductDetails(productDetails);
		console.log(productDetails);
	});
}

function getFruitProductDetails(productDetails){
	var rawTemplate = $("#productsTemplate").html();
	var compiledTemplate = Handlebars.compile(rawTemplate);
	var html = compiledTemplate(productDetails);
	$("#fruitproducts").html(html);
	$('a[id=openRequest]').click(function() {
		$('#requestForm').modal('show');
		return false;
	});
}

function getVeggieProductDetails(productDetails){
	var rawTemplate = $("#productsTemplate").html();
	var compiledTemplate = Handlebars.compile(rawTemplate);
	var html = compiledTemplate(productDetails);
	$("#veggieproducts").html(html);
	$('a[id=openRequest]').click(function() {
		$('#requestForm').modal('show');
		return false;
	});
}


function getCropProductDetails(productDetails){
	var rawTemplate = $("#productsTemplate").html();
	var compiledTemplate = Handlebars.compile(rawTemplate);
	var html = compiledTemplate(productDetails);
	$("#cropproducts").html(html);
	$('a[id=openRequest]').click(function() {
		$('#requestForm').modal('show');
		return false;
	});
}

function getDairyPoultryProductDetails(productDetails){
	var rawTemplate = $("#productsTemplate").html();
	var compiledTemplate = Handlebars.compile(rawTemplate);
	var html = compiledTemplate(productDetails);
	$("#dairypoultryproducts").html(html);
	$('a[id=openRequest]').click(function() {
		$('#requestForm').modal('show');
		return false;
	});
}
function getCategories() {
	$.ajax({
		type : "get",
		contentType : "application/json",
		url : "/categories",
		dataType : 'json'
	}).done(function(response) {
		categories = response;
		createHTML(categories);
	});
}

function createHTML(categories){
	var rawTemplate = $("#navTemplate").html();
	var compiledTemplate = Handlebars.compile(rawTemplate);
	var html = compiledTemplate(categories);
	$("#categories-nav").html(html);
	$('#Dairy-Poultry-nav').on('click', function() {	
		getDairyAndPoultry();
		$("#diaryAndPoultry").show();
		$("#fruits").hide();
		$("#crops").hide();
		$("#veggies").hide();
	})
	$('#Fruits-nav').on('click', function() {
		getFruitProducts();
		$("#veggies").hide();
		$("#fruits").show();
		$("#crops").hide();
		$("#diaryAndPoultry").hide();
	})
	$('#Veggies-nav').on('click', function() {
		getVeggieProducts();
		$("#veggies").show();
		$("#fruits").hide();
		$("#crops").hide();
		$("#diaryAndPoultry").hide();
	})
	$('#Crops-nav').on('click', function() {
		getCropProducts();
		$("#crops").show();
		$("#fruits").hide();
		$("#veggies").hide();
		$("#diaryAndPoultry").hide();
	})
}