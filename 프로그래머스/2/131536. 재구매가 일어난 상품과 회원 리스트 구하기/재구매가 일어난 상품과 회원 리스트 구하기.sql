-- 코드를 입력하세요
-- 조건: 동일한 회원이 동일한 상품을 재구매한 데이터
-- 정렬기준: 회원 ID로 오름차순 정렬, 그 다음 상품 ID로 내림차순 정렬
SELECT
    user_id,
    product_id
FROM online_sale
GROUP BY user_id, product_id
HAVING COUNT(*) >= 2
ORDER BY user_id, product_id DESC;