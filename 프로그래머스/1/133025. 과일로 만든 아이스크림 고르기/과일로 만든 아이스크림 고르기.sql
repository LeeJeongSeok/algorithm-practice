-- 코드를 입력하세요
-- 조건: 총주문량이(total_order) 3000보다 높으면서, 주 성분이(ingredient_type)이 과일인 아이스크림의 맛
-- 순서: 총주문량이 큰 순서대로 조회
SELECT
    i.flavor
FROM icecream_info AS i
LEFT JOIN first_half as f
ON i.flavor = f.flavor
WHERE i.ingredient_type LIKE 'fruit_based'
AND f.total_order > 3000
ORDER BY f.total_order DESC;