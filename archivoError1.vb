Module VbModule

        function factorial(n As Integer) As 
                If n  0 Then
                    return 0
                else
                    return factorial(n-1)
                end if
        End Function

        Sub Main()
                console.writeline("Ingrese el n para calcular el factorial")
                Dim n as Integer 
                n = console.readline()
                factorial(n)                
        end sub
End Module