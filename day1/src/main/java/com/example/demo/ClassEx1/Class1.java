package com.example.demo.ClassEx1;

		import org.springframework.web.bind.annotation.GetMapping;

		import org.springframework.web.bind.annotation.RestController;



		@RestController



		public class Class1 {

			public String name = "Iamneo";

		@GetMapping("/setName")	

		public String getName()

		{

			return "Welcome "+name;

		}

		}



	


