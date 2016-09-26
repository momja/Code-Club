from django.http import HttpResponseRedirect
from django.shortcuts import render

from .forms import ContactForm

def contact_form(request):
    if request.method == "POST":
        form = ContactForm(request.POST)
        if form.is_valid():
            post = form.save(commit=False)
            post.save()
            form = ContactForm()
    else:
        form = ContactForm()

    return render(request, 'form/contact_form.html', {'form': form})
