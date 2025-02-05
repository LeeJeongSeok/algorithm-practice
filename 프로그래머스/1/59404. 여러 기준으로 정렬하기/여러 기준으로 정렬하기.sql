-- 코드를 입력하세요
-- 조건: 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회 단, 이름이 같다면 보호를 나중에 시작한 동물 먼저
-- 보호를 나중에 시작한 동물이라하면 날짜가 내림차순이여야한다.
SELECT
    animal_id,
    name,
    datetime
FROM animal_ins
ORDER BY name, datetime DESC;