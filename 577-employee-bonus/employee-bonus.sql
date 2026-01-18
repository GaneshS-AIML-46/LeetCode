# Write your MySQL query statement below
select name, bonus from employee as e LEFT join bonus as b on e.empId=b.empId
where  bonus <1000 or bonus is null;