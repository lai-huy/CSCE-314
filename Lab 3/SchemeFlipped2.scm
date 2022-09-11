; Author: Huy Lai, Elizabeth Knatcher, Nefemi Esan
; Date: 2022 09 11

(define (num2List num)
  (cond
   ((< num 10) (list num))
   (else (append (num2List (quotient num 10))
           (list (- num (* 10 (quotient num 10))))
	 )
    )
  )
)

(define (getNthDigit number digit)
  (define l (num2List number))
  (cond
   ((null? l) -1)
   ((equal? 0 digit) (car l))
   (else (getNthDigit (cdr l) (- digit 1)))
   )
)

(define (main)
  (display (getNthDigit 1234567890 1))
  ;(display (num2List 123456789))
  (display "\n")
)

(main)
(exit)
