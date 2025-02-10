-- 코드를 입력하세요
-- 조건: 강원도에 위치한 식품공장을 출력
-- 정렬: 공장 ID를 기준으로 오름차순
SELECT
    factory_id,
    factory_name,
    address
FROM food_factory
WHERE LEFT(address, 3) LIKE '강원도'
ORDER BY factory_id;