-- 코드를 입력하세요
-- 조건: 젊은 동물의 아이디와 이름을 조회, 아이디순으로, INTAKE_CONDTION이 Aged가 아닌 애들만 뽑아야할듯
SELECT
    animal_id,
    name
FROM animal_ins
WHERE intake_condition NOT LIKE 'Aged'
ORDER BY animal_id;