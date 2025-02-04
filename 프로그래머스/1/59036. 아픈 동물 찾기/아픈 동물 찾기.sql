-- 코드를 입력하세요
-- 조건: 아픈 동물, 아이디 순으로 조회
SELECT
    animal_id,
    name
FROM animal_ins
WHERE intake_condition LIKE 'Sick'
ORDER BY animal_id;