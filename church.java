// JavaScript to add the floating effect on scroll
document.addEventListener('scroll', function() {
    const floatingElements = document.querySelectorAll('.floating-text, .floating-image');
    const triggerPoint = window.innerHeight * 0.8; // Trigger animation when 80% of the viewport is reached

    floatingElements.forEach(element => {
        const elementPosition = element.getBoundingClientRect().top;
        
        if (elementPosition < triggerPoint) {
            element.classList.add('floating'); // Add the 'floating' class to trigger animation
        }
    });
});
