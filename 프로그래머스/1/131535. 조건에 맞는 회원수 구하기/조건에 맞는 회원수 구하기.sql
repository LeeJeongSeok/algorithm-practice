-- 코드를 입력하세요
-- 조건: 2021년에 가입한 회원 중 20세 이상 29세 이하인 회원 출력
SELECT
    COUNT(*) as users
FROM user_info
WHERE YEAR(joined) LIKE '2021' AND 
      age >= 20 AND
      age <= 29 AND
      age IS NOT NULL