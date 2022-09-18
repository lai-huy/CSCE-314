#lang racket
(define(palindrome? list1)
  (cond
    ; check if list has 0 or 1 elements
    ((null? list1) #t)
    ((null? (cdr list1)) #t)

    ;case car atom equals '-' and reverse car atom equals '-'
    (((and (equal? (car list1) #-) (equal? (car(reverse(list1))) #-)))
     ((equal? (caar list1) (caar(reverse(list1)))))
     (palindrome? (cddr(reverse(cddr list1)))) #f)
    ;case car atom equals '-' and reverse car atom does not equal '-'
    ((equal? (car list1) #-)
     (equal? (caar list1) (car(reverse(list1)))
      (palindrome? (cdr(reverse(cddr list1))))) #f)
    ;case car atom doesnt equal '-' and reverse car atom equals '-'
    ((equal? (car (reverse (list1))) #-)
     (equal? (car list1) (caar(reverse(list1)))
      (palindrome? (cddr(reverse(cdr list1))))) #f)
    ;case car atom doesnt equal '-' and reverse car atom doesnt equal '-'
    ((equal? (car(list1)) (car(reverse(list1))))
     (palindrome? (cdr(reverse(cdr list1)))) #f)
    )
  )



(display (palindrome? '(m a d a m - i m - a d a m)))
(exit)