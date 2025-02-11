-- 코드를 입력하세요
-- 조건: 아이스크림의 맛 출력
-- 정렬: 총주문량을 기준으로 내림차순, 출하 번호로 오름차순
SELECT
    flavor
FROM first_half
ORDER BY total_order DESC, shipment_id ASC;