    <script>

        const tableRows = document.querySelectorAll('#myTable tr');

        tableRows.forEach(row => {
            row.addEventListener('mouseover', function() {
                this.classList.add('highlight-row');
            });

            row.addEventListener('mouseout', function() {
                this.classList.remove('highlight-row');
            });
        });
    </script>