-- 코드를 입력하세요
-- 조건: 12세 이하인 여자환자 환자이름, 환자번호, 성별코드, 나이, 전화번호, 전화번호가 없는 경우 'NONE'
-- 정렬: 나이를 기준으로 내림차순, 환자이름 오름차순
SELECT
    pt_name,
    pt_no,
    gend_cd,
    age,
    IFNULL(tlno, "NONE") AS tlno
FROM
    patient
WHERE age <= 12
  AND gend_cd LIKE 'W'
ORDER BY age DESC, pt_name ASC