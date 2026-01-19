# 🏪 Retail Billing Software  
**Spring Boot + React | JWT Security | Razorpay Integration**

A **full-stack retail billing software** built using **Spring Boot (backend)** and **React (frontend)**.  
The application supports **inventory management, billing, payments, role-based access control**, and a **responsive user interface**, designed to reflect real-world retail workflows.

---

## 🚀 Features Overview

### 🔐 Authentication & Authorization
- JWT-based authentication using Spring Security
- Role-based access control:
  - **Admin** – Full system access
  - **Shop Associate/User** – Limited access (billing & order history)
- Secure login and registration
- Protected backend APIs and frontend routes

---

## 👥 User Roles

### 👑 Admin
- Manage users
- Manage categories & items
- View dashboard analytics
- View & delete orders

### 🧑‍💼 Shop Associate / User
- Explore categories & items
- Add items to cart
- Place orders
- View order history

---

## 📊 Admin Dashboard

- Today’s total sales
- Today’s order count
- Recent five orders
- Aggregated using optimized JPQL queries

---

## 🖥️ Frontend (React)

- Built using **React + Vite**
- Responsive UI with **Bootstrap & Bootstrap Icons**
- Role-based navigation visibility
- Protected routes with JWT
- Global state management using **React Context**
- Search, filter, and scrollable lists
- Toast notifications for user feedback

---

## 📦 Category & Item Management

- Create, update, delete categories and items
- Item-to-category mapping
- Category cards display dynamic item count
- Form validation for required fields
- Image upload support:
  - Local server storage
  - AWS S3 (optional)

---

## 🧑‍💼 User Management

- Admin can add and delete users
- Validation for user inputs
- Secure API access restricted by role

---

## 🛒 Explore & Billing Module

- Browse items by category
- Add items to cart
- Quantity management (increase / decrease / delete)
- Customer details input
- Order placement with:
  - **Cash**
  - **UPI (Razorpay)**

---

## 💳 Razorpay UPI Payment Integration

- Razorpay order creation
- Payment UI integration
- Payment verification
- Success & failure handling
- Order rollback on payment failure
- Toast notifications for payment status

---

## 🧾 Receipt & Printing

- Receipt popup after order completion
- Displays:
  - Items
  - Quantities
  - Total amount
  - Payment mode
  - Customer details
- Print-friendly UI (buttons hidden during printing)

---

## 📜 Order Management

- Orders and order items stored with audit fields
- Order history view
- Admin-only order deletion
- Dashboard aggregation for analytics

---

## 🔐 Security Implementation

- Spring Security with JWT
- Role-based endpoint protection:
  - `/admin/**` → Admin only
  - `/login`, `/encode` → Public
  - All others → Authenticated
- Frontend route protection
- Conditional rendering based on roles

---

## ⚙️ Tech Stack

### Backend
- Spring Boot 3.5.1
- Spring Security + JWT
- MySQL
- JPA / Hibernate
- Lombok
- Maven
- Java 21

### Frontend
- React (Vite)
- Axios
- React Router DOM
- Bootstrap
- Bootstrap Icons

### Payments & Storage
- Razorpay (UPI Payments)
- AWS S3 (optional)
- Local file storage (alternative)


---

## 🧪 Validation & Error Handling

- Form validations (frontend & backend)
- API exception handling
- Payment failure handling
- Toast notifications for feedback

---

## 📊 Image Upload Comparison

| Feature | AWS S3 | Local Upload |
|------|------|------|
| Storage | Cloud | Server file system |
| Scalability | High | Limited |
| Performance | Optimized | Degrades with size |
| Setup | Requires AWS config | Simple |
| Recommended | Production | Demo / Learning |

---

## 🧠 Key Takeaways

- End-to-end retail billing workflow
- Secure role-based system
- Real payment gateway integration
- Clean frontend-backend separation
- Modular and extensible architecture
- Production-ready design approach

---

## ❓ FAQ

**Q: How is authentication handled?**  
JWT tokens generated on login and validated on each request using Spring Security.

**Q: Can images be stored locally?**  
Yes, images can be stored in a local `/uploads` directory or AWS S3.

**Q: What payment methods are supported?**  
Cash and UPI via Razorpay.

**Q: Are admin and user views different?**  
Yes, access and UI are role-based.

---

## 📌 Future Enhancements

- Pagination for large datasets
- Advanced analytics & reports
- Email/SMS notifications
- Microservices decomposition
- Kafka-based order events

---

## ✨ Author

**Aashay Chandratre**  
Backend Engineer | Spring Boot | React | System Design

---

> *Designed to simulate real-world retail billing systems with security, scalability, and usability in mind.*


