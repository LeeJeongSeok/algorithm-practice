-- 코드를 입력하세요
-- 12세 이하인 여자환자, 전화번호가 없는 경우 'NONE', 나이를 기준으로 내림차순, 환지이름으로 오름차순
SELECT 
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    IFNULL(TLNO, 'NONE')
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME;