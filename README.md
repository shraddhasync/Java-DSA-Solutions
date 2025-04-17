# ⚡ Java DSA & Development Solutions
**Shraddha Sharma** • BTech IT (8.72 CGPA) • Cognizant GenC Next Candidate  
📧 shraddhagkg6982@gmail.com • 🔗 [LinkedIn](your_link) • 📞 +91 6266956656

---

## 🛠 **Technical Highlights**
### 🔢 Problem-Solving Stats
- **300+ LeetCode/HackerRank Solutions**
- **85% Java | 15% JavaScript**
- **Contest Rating**: Top 25% (if applicable)

### 🧮 Optimized DSA Solutions
| **Category**       | **Star Solutions**                  | **Complexity** |
|--------------------|-------------------------------------|----------------|
| Arrays & Hashing   | `ProductExceptSelf.java`            | O(n) time      |
| Two Pointers       | `TrappingRainWater.java`            | O(1) space     |
| Dynamic Programming| `LongestPalindromicSubstring.java`  | O(n²) time     |

### 💼 Relevant Projects
- **E-Commerce Analyzer**: SQL + Excel dashboard (40% efficiency gain)
- **Agile Team Project**: Blockchain prototype (Bootstrap + REST APIs)
- **CSS Learning Game**: React + GSAP animations (30% engagement boost)

---

## 🔍 **Cognizant GenC Next Alignment**
✅ **Core Java Proficiency** (250+ problems)  
✅ **SQL/BI Skills** (MySQL, Excel PivotTables)  
✅ **Agile Development Experience**  
✅ **Full-Stack Awareness** (React, JavaScript)  

📌 *Preparing for Cognizant GenC Next roles with hands-on Java practice!*

---




# 📊 SQL for E-Commerce Sales Analysis

This repository contains SQL queries I developed for my **Sales Data Analyzer** project during my BTech studies. These queries helped extract business insights from an e-commerce dataset.

## 🛠️ Skills Demonstrated
- **Data Aggregation** (SUM, COUNT, GROUP BY)
- **Table Joins** (INNER JOIN, LEFT JOIN)
- **Business Intelligence** (Revenue trends, product performance)
- **Excel Integration** (Exported results for PivotTable dashboards)

## 📂 Files
| File | Description |
|------|-------------|
| [`sales_analysis.sql`](./sales_analysis.sql) | Core queries for sales reporting |
| [`query_screenshots/`](./query_screenshots/) | Sample outputs (optional) |

## ✨ Highlighted Queries
```sql
-- Top 5 Products by Sales
SELECT product_name, SUM(quantity) as total_units_sold
FROM products
JOIN order_details ON products.id = order_details.product_id
GROUP BY product_name
ORDER BY total_units_sold DESC
LIMIT 5;

-- Monthly Revenue Growth
SELECT 
  DATE_FORMAT(order_date, '%Y-%m') as month,
  SUM(quantity * price) as monthly_revenue
FROM orders
JOIN order_details ON orders.id = order_details.order_id
GROUP BY month;
  



## 📬 **Let's Connect!**
Open to Java developer roles and opportunities:  
📩 shraddhagkg6982@gmail.com  
🔗 [LeetCode Profile](your_link) • 🌐 [Portfolio Site](optional_link)
