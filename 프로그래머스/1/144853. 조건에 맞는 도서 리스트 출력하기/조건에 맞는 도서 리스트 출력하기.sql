-- 코드를 입력하세요
-- 조건: 2021년에 출판한 인문 카테고리에 속하는 도서를 찾아서 도서 ID, 출판일을 출력
-- 정렬: 출판일을 기준으로 오름차순
SELECT
    book_id,
    DATE_FORMAT(published_date, '%Y-%m-%d') AS published_date
FROM book
WHERE YEAR(published_date) = 2021
  AND category = '인문'
ORDER BY published_date ASC;