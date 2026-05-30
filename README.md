#  rest-assured-api-test-guard

A simple API testing project built using Java, RestAssured, and TestNG. This repository contains the exact test files I created to learn and practice backend automation.

---

##  Tech Stack Used
- **Language**: Java
- **API Testing Framework**: RestAssured
- **Testing Engine**: TestNG
- **Data Formats**: JSON and XML/SOAP

---

##  What is Inside This Project

### 1. REST API Tests (`GetAndPostExamples.java`)
- **GET Test**: Fetches user data from JSONPlaceholder and verifies the status code is `200`. It also checks the exact username and email at a specific index.
- **POST Test**: Uses a modern Java Record to securely structure a complex, nested user profile payload and sends a `POST` request.

### 2. Update & Delete Tests (`PutPatchDeleteExamples.java`)
- **PUT Test**: Uses `json-simple` (`JSONObject`) to pack name and email data and updates user details.
- **DELETE Test**: Sends a request to delete a user profile and verifies the system response.

### 3. SOAP API Tests (`SoapXMLRequest.java`)
- **SOAP Test**: Reads a raw XML envelope from a local file, injects the necessary `SOAPAction` headers, and sends a math-addition request to a live calculator web service.

### 4. Data Models (`UserPayload.java`)
- Uses modern **Java Records** (`Geo`, `Address`, `Company`, `UserPayload`) to store user details neatly without messy boilerplate code.

---

##  How to Run the Tests

1. Clone this repository:
   ```bash
   git clone https://github.com
   ```
2. Open the project in **Eclipse IDE**.
3. Make sure you have the **TestNG plugin** installed in Eclipse.
4. Right-click on any of the test files (e.g., `GetAndPostExamples.java`) and select **Run As > TestNG Test**.

---

##  Contact
Developed by **Neeraj** — Feel free to check out my repository and connect!
