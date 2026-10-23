window.addEventListener('DOMContentLoaded', () => {

    const tabs = document.querySelectorAll('.tabheader__item'),
          tabsContent = document.querySelectorAll('.tabcontent'),
          tabsParent = document.querySelector('.tabheader__items');

    function hideTabContent() {
        tabsContent.forEach((item) => {
            item.classList.add('hide');
            item.classList.remove('show');
        });

        tabs.forEach((tab) => {
            tab.classList.remove('tabheader__item_active');
        });
    }

    function showTabContent(i = 0) {
        if (!tabsContent[i] || !tabs[i]) {
            return;
        }

        tabsContent[i].classList.add('show');
        tabsContent[i].classList.remove('hide');

        tabs[i].classList.add('tabheader__item_active');
    }

    hideTabContent();
    showTabContent();

    if (tabsParent) {
    tabsParent.addEventListener('click', (event) => {
        const target = event.target.closest('.tabheader__item');

        if (!target || !tabsParent.contains(target)) {
            return;
          }

            tabs.forEach((tab, i) => {
                if (tab === target) {
                    hideTabContent();
                    showTabContent(i);
                }
            });
        });
     }
});
